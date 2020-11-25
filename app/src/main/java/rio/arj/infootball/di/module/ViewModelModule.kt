package rio.arj.infootball.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import rio.arj.dashboard.DashboardViewModel
import rio.arj.infootball.ui.mainpage.MainViewModel

@Module
abstract class ViewModelModule {

  @Binds
  abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

  @Binds
  @IntoMap
  @ViewModelKey(DashboardViewModel::class)
  abstract fun bindsDashboardViewModel(dashboardViewModel: DashboardViewModel): ViewModel

}