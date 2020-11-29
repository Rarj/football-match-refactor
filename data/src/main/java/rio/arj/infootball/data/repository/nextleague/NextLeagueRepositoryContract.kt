package rio.arj.infootball.data.repository.nextleague

import rio.arj.infootball.data.repository.nextleague.model.NextLeagueModel

interface NextLeagueRepositoryContract {
  suspend fun loadMainFootballMatch(): NextLeagueModel?
}