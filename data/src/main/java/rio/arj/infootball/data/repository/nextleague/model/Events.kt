package rio.arj.infootball.data.repository.nextleague.model

import com.google.gson.annotations.SerializedName
import rio.arj.core.utils.DateUtils

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
) {
  fun getDateFormatted(): String {
    return DateUtils().convertSimpleDateFormat(dateEvent)
  }
}