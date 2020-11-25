package rio.arj.infootball.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import rio.arj.infootball.MyApp
import rio.arj.infootball.di.module.ActivityModule
import rio.arj.infootball.di.module.NetworkModule
import rio.arj.infootball.di.module.ViewModelModule
import javax.inject.Singleton

@Singleton
@Component(
  modules = [
    NetworkModule::class,
    AndroidSupportInjectionModule::class,
    ActivityModule::class,
    ViewModelModule::class]
)
interface CoreComponent {

  @Component.Builder
  interface BuilderApp {
    @BindsInstance
    fun application(application: Application): BuilderApp

    @BindsInstance
    fun networkModule(networkModule: NetworkModule): BuilderApp

    fun buildApiComponent(): CoreComponent
  }

  fun injectMyApp(myApp: MyApp)

}