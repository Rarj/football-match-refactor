package rio.arj.infootball

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import rio.arj.infootball.di.DaggerCoreComponent
import rio.arj.infootball.di.module.NetworkModule
import javax.inject.Inject

class MyApp : Application(), HasAndroidInjector {

  @Inject
  lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

  override fun onCreate() {
    super.onCreate()

    DaggerCoreComponent.builder()
      .application(this)
      .networkModule(NetworkModule())
      .buildApiComponent()
      .injectMyApp(this)
  }

  override fun androidInjector(): AndroidInjector<Any> {
    return dispatchingAndroidInjector
  }
}