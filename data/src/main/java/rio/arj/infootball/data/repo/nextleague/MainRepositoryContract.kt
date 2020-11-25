package rio.arj.infootball.data.repo.nextleague

import rio.arj.infootball.data.repo.nextleague.model.NextLeagueModel

interface MainRepositoryContract {
  suspend fun loadMainFootballMatch(): NextLeagueModel?
}