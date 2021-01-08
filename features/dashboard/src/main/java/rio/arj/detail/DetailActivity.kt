package rio.arj.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import rio.arj.core.Constant
import rio.arj.dashboard.R
import rio.arj.dashboard.databinding.ActivityDetailBinding
import rio.arj.infootball.data.repository.nextleague.model.Events

class DetailActivity : AppCompatActivity() {

  private val intentEventModel by lazy {
    intent.getParcelableExtra(Constant.INTENT_KEY) as Events
  }

  lateinit var binding: ActivityDetailBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
    binding.eventModel = intentEventModel
  }
}