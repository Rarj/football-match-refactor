package rio.arj.infootball.data.service

import retrofit2.http.GET
import rio.arj.infootball.data.repo.nextleague.model.NextLeagueModel

interface ApiService {

  @GET("eventsnextleague.php?id=4328")
  suspend fun getEvents(): NextLeagueModel

}