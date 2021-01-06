package rio.arj.dashboard

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import rio.arj.core.Constant.INTENT_KEY
import rio.arj.dashboard.databinding.ActivityNextLeagueBinding
import rio.arj.dashboard.di.DaggerDashboardComponent
import rio.arj.dashboard.di.DashboardModule
import rio.arj.detail.DetailActivity
import javax.inject.Inject

class NextLeagueActivity : AppCompatActivity() {

  @Inject
  lateinit var viewModeFactory: ViewModelProvider.Factory

  private lateinit var viewModel: NextLeagueViewModel
  private lateinit var binding: ActivityNextLeagueBinding

  private val nextLeagueAdapter by lazy {
    NextLeagueAdapter(
      { model ->
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(INTENT_KEY, model)
        startActivity(intent)
      },
      mutableListOf()
    )
  }

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

    initRecyclerView()
    observer()
  }

  private fun initRecyclerView() {
    binding.recyclerNextLeague.apply {
      layoutManager = LinearLayoutManager(this@NextLeagueActivity)
      adapter = nextLeagueAdapter
    }
  }

  private fun observer() {
    viewModel.getIsDataLoaded().observe(this, {
      if (it) {
        nextLeagueAdapter.createList(viewModel.resultMatchFootball?.events ?: mutableListOf())
        nextLeagueAdapter.notifyDataSetChanged()
      }
    })
  }
}