package rio.arj.infootball.di

import dagger.Module
import dagger.Provides
import rio.arj.infootball.di.service.ApiService

@Module
class NetworkModule {

  @Provides
  @NetworkScope
  fun provideNetworkService(): ApiService {
    return NetworkBuilder().getApiService()
  }

}