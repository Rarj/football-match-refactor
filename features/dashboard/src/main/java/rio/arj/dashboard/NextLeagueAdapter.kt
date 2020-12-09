package rio.arj.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import rio.arj.dashboard.databinding.ItemNextLeagueBinding
import rio.arj.infootball.data.repository.nextleague.model.Events

class NextLeagueAdapter(
  private val listLeague: MutableList<Events>
) : RecyclerView.Adapter<NextLeagueViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NextLeagueViewHolder {
    val layoutInflater = LayoutInflater.from(parent.context)
    val binding = ItemNextLeagueBinding.inflate(layoutInflater, parent, false)
    return NextLeagueViewHolder(binding)
  }

  override fun onBindViewHolder(holder: NextLeagueViewHolder, position: Int) {
    holder.bind(listLeague[position])
  }

  override fun getItemCount() = listLeague.size

  fun createList(newList: List<Events>) {
    listLeague.clear()
    listLeague.addAll(newList)
  }

}