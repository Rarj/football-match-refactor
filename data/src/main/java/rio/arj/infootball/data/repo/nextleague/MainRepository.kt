package rio.arj.infootball.data.repo.nextleague

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import rio.arj.infootball.data.repo.nextleague.model.NextLeagueModel
import rio.arj.infootball.data.service.ApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainRepository @Inject constructor(private val apiService: ApiService) :
  MainRepositoryContract {

  override suspend fun loadMainFootballMatch(): NextLeagueModel? {
    return withContext(Dispatchers.IO) {
      apiService.getEvents()
    }
  }
}