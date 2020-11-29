package rio.arj.dashboard.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import rio.arj.core.ViewModelFactory
import rio.arj.core.ViewModelKey
import rio.arj.dashboard.NextLeagueViewModel

@Module
abstract class DashboardViewModelModule {

  @DashboardScope
  @Binds
  abstract fun bindsViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

  @Binds
  @IntoMap
  @ViewModelKey(NextLeagueViewModel::class)
  abstract fun bindsDashboardViewModel(nextLeagueViewModel: NextLeagueViewModel): ViewModel

}