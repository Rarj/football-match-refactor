package rio.arj.infootball.data.repository.nextleague.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import rio.arj.core.utils.DateUtils

@Parcelize
data class Events(
  @SerializedName("idEvent")
  val idEvent: String,
  @SerializedName("strEvent")
  val nameEvent: String,
  @SerializedName("dateEvent")
  val dateEvent: String,
  @SerializedName("strThumb")
  val imageThumbnail: String,
  @SerializedName("strLeague")
  val leagueName: String,
  @SerializedName("strVenue")
  val venueName: String,
  @SerializedName("intHomeScore")
  val scoreHome: Int?,
  @SerializedName("intAwayScore")
  val scoreAway: Int?,
) : Parcelable {
  fun getDateFormatted(): String {
    return DateUtils().convertSimpleDateFormat(dateEvent)
  }

  fun getScoreHomes() = scoreHome?.toString() ?: "-"

  fun getScoreAways() = scoreAway?.toString() ?: "-"
}