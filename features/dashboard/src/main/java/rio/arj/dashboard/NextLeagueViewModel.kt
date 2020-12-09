package rio.arj.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import rio.arj.infootball.data.repository.nextleague.NextLeagueRepository
import rio.arj.infootball.data.repository.nextleague.model.NextLeagueModel
import javax.inject.Inject

class NextLeagueViewModel @Inject constructor(private val repository: NextLeagueRepository) :
  ViewModel() {

  private var result: NextLeagueModel? = null
  val resultMatchFootball: NextLeagueModel?
    get() = result

  private var isDataLoaded = MutableLiveData<Boolean>()
  fun getIsDataLoaded(): LiveData<Boolean> = isDataLoaded

  init {
    getFootball()
  }

  private fun getFootball(): NextLeagueModel? {
    viewModelScope.launch {
      result = repository.loadMainFootballMatch()
      isDataLoaded.value = true
    }
    return result
  }

}