package rio.arj.infootball

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import rio.arj.dashboard.NextLeagueActivity

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    startActivity(Intent(this, NextLeagueActivity::class.java))
    finish()
  }
}