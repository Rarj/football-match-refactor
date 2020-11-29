package rio.arj.dashboard.di

import dagger.Module
import dagger.Provides
import rio.arj.infootball.data.repository.nextleague.NextLeagueRepository
import rio.arj.infootball.di.NetworkModule
import rio.arj.infootball.di.NetworkScope
import rio.arj.infootball.di.service.ApiService

@Module(includes = [NetworkModule::class])
class DashboardModule {

  @Provides
  @DashboardScope
  fun providesDashboardRepository(@NetworkScope service: ApiService): NextLeagueRepository {
    return NextLeagueRepository(service)
  }

}