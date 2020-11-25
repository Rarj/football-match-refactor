package rio.arj.infootball.ui.mainpage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import dagger.android.AndroidInjection
import rio.arj.infootball.R
import rio.arj.infootball.data.repo.nextleague.model.NextLeagueModel
import rio.arj.infootball.databinding.ActivityMainBinding
import rio.arj.infootball.di.module.ViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

  @Inject
  lateinit var viewModelFactory: ViewModelFactory

  private lateinit var viewModel: MainViewModel
  private lateinit var binding: ActivityMainBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    AndroidInjection.inject(this)

    viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    binding.lifecycleOwner = this



  }
}