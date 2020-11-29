package rio.arj.dashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import rio.arj.dashboard.databinding.ActivityNextLeagueBinding
import rio.arj.dashboard.di.DaggerDashboardComponent
import rio.arj.dashboard.di.DashboardModule
import javax.inject.Inject

class NextLeagueActivity : AppCompatActivity() {

  @Inject
  lateinit var viewModeFactory: ViewModelProvider.Factory

  private lateinit var viewModel: NextLeagueViewModel
  private lateinit var binding: ActivityNextLeagueBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    DaggerDashboardComponent.builder()
      .dashboardModule(DashboardModule())
      .build()
      .injectDashboard(this)

    viewModel = ViewModelProvider(this, viewModeFactory).get(NextLeagueViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_next_league)
    binding.viewModel = viewModel
    binding.lifecycleOwner = this

    observer()
  }

  private fun observer() {
    viewModel.getIsDataLoaded().observe(this, {
      if (it) {

      }
    })
  }
}