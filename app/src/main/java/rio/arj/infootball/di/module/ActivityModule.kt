package rio.arj.infootball.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import rio.arj.infootball.ui.mainpage.MainActivity

@Module
abstract class ActivityModule {
  @ContributesAndroidInjector
  abstract fun contributorMainActivity(): MainActivity
}