package rio.arj.infootball.data.repository.nextleague

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import rio.arj.infootball.data.repository.nextleague.model.NextLeagueModel
import rio.arj.infootball.di.service.ApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NextLeagueRepository @Inject constructor(private val apiService: ApiService) :
  NextLeagueRepositoryContract {

  override suspend fun loadMainFootballMatch(): NextLeagueModel? {
    return withContext(Dispatchers.IO) {
      apiService.getNextLeague()
    }
  }
}