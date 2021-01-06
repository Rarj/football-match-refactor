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
) : Parcelable {
  fun getDateFormatted(): String {
    return DateUtils().convertSimpleDateFormat(dateEvent)
  }
}