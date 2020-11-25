package rio.arj.infootball.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import rio.arj.dashboard.DashboardActivity

@Module
abstract class ActivityModule {
  @ContributesAndroidInjector
  abstract fun contributorDashboardActivity(): DashboardActivity
}