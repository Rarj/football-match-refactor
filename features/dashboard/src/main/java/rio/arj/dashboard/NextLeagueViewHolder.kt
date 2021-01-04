package rio.arj.dashboard

import androidx.recyclerview.widget.RecyclerView
import com.jakewharton.rxbinding2.view.RxView
import io.reactivex.disposables.CompositeDisposable
import rio.arj.dashboard.databinding.ItemNextLeagueBinding
import rio.arj.infootball.data.repository.nextleague.model.Events

class NextLeagueViewHolder(private val binding: ItemNextLeagueBinding) :
  RecyclerView.ViewHolder(binding.root) {

  fun bind(listener: (modelEvents: Events) -> Unit, eventModel: Events) {
    binding.eventModel = eventModel

    CompositeDisposable().add(
      RxView.clicks(binding.root)
        .subscribe { listener(eventModel) }
    )
  }

}
