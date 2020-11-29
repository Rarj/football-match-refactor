package rio.arj.dashboard.di

import dagger.Component
import rio.arj.dashboard.NextLeagueActivity
import javax.inject.Singleton

@DashboardScope
@Singleton
@Component(modules = [DashboardModule::class, DashboardViewModelModule::class])
interface DashboardComponent {

  fun injectDashboard(nextLeagueActivity: NextLeagueActivity)

}