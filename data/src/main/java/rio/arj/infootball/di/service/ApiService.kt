package rio.arj.infootball.di.service

import retrofit2.http.GET
import rio.arj.infootball.data.repository.nextleague.model.NextLeagueModel

interface ApiService {

  @GET("eventsnextleague.php?id=4328")
  suspend fun getNextLeague(): NextLeagueModel

}