package rio.arj.dashboard

import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import rio.arj.dashboard.databinding.ItemNextLeagueBinding
import rio.arj.infootball.data.repository.nextleague.model.Events

class NextLeagueViewHolder(private val binding: ItemNextLeagueBinding) :
  RecyclerView.ViewHolder(binding.root) {

  fun bind(eventModel: Events) {
    binding.eventModel = eventModel

    if (adapterPosition % 2 == 0) {
      setBackgroundColor(R.color.gray_A6A6A6)
    } else {
      setBackgroundColor(R.color.white_FFFFFF)
    }
  }

  private fun setBackgroundColor(@ColorRes color: Int) = binding.containerRoot.setBackgroundColor(
    ContextCompat.getColor(binding.root.context, color)
  )

}
