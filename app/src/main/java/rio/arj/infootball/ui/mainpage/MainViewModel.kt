package rio.arj.infootball.ui.mainpage

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import rio.arj.infootball.data.repo.nextleague.MainRepository
import rio.arj.infootball.data.repo.nextleague.model.NextLeagueModel
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: MainRepository) : ViewModel() {

  val resultMatchFootball: NextLeagueModel?
    get() = getFootball()

  private var isDataLoaded = MutableLiveData(false)

  fun getIsDataLoaded() = isDataLoaded

  init {
    getFootball()
  }

  private fun getFootball(): NextLeagueModel? {
    var result: NextLeagueModel? = null
    viewModelScope.launch {
      result = repository.loadMainFootballMatch()
      isDataLoaded.value = true
    }
    return result
  }

}