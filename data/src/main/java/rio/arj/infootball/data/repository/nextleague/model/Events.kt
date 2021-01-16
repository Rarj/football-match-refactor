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
  @SerializedName("strHomeYellowCards")
  val yellowCardsHome: String?,
  @SerializedName("strHomeRedCards")
  val redCardsHome: String?,
  @SerializedName("strAwayYellowCards")
  val yellowCardsAway: String?,
  @SerializedName("strAwayRedCards")
  val redCardsAway: String?,
  @SerializedName("intHomeShots")
  val shotsHome: Int?,
  @SerializedName("intAwayShots")
  val shotsAway: Int?,
  @SerializedName("strHomeFormation")
  val formationHome: String?,
  @SerializedName("strAwayFormation")
  val formationAway: String?,
  @SerializedName("strTime")
  val timeEvent: String?,
) : Parcelable {
  fun getDateFormatted(): String {
    return DateUtils().convertSimpleDateFormat(dateEvent)
  }

  fun getTimeEvents(): String {
    return DateUtils().convertSimpleTimeFormat(timeEvent)
  }

  fun getScoreHomes() = scoreHome?.toString() ?: "-"

  fun getScoreAways() = scoreAway?.toString() ?: "-"

  fun getYellowRedCardHome(): String {
    val yellowCardsArray = yellowCardsHome?.split(";")?.toTypedArray()
    val redCardsArray = redCardsHome?.split(";")?.toTypedArray()

    val yellowCardString = yellowCardsArray?.joinToString("(YELLOW), ") ?: "-"
    val redCardString = redCardsArray?.joinToString("(RED), ") ?: "-"

    val result = yellowCardString + redCardString

    return if (result == "--") {
      "-"
    } else {
      result
    }
  }

  fun getYellowRedCardAway(): String {
    val yellowCardsArray = yellowCardsAway?.split(";")?.toTypedArray()
    val redCardsArray = redCardsAway?.split(";")?.toTypedArray()

    val yellowCardString = yellowCardsArray?.joinToString("(YELLOW), ") ?: "-"
    val redCardString = redCardsArray?.joinToString("(RED), ") ?: "-"

    val result = yellowCardString + redCardString

    return if (result == "--") {
      "-"
    } else {
      result
    }
  }

  fun getFormationAways() = formationAway ?: "-"

  fun getFormationHomes() = formationHome ?: "-"

  fun getShotsAways() = shotsAway ?: "-"

  fun getShotsHomes() = shotsHome ?: "-"
}