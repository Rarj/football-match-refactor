package rio.arj.dashboard

import androidx.recyclerview.widget.RecyclerView
import rio.arj.dashboard.databinding.ItemNextLeagueBinding
import rio.arj.infootball.data.repository.nextleague.model.Events

class NextLeagueViewHolder(private val binding: ItemNextLeagueBinding) :
  RecyclerView.ViewHolder(binding.root) {

  fun bind(eventModel: Events) {
    binding.eventModel = eventModel
  }

}
