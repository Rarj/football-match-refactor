package rio.arj.infootball.data.repository.nextleague.model

import com.google.gson.annotations.SerializedName

data class Events(
  @SerializedName("idEvent")
  val idEvent: String,
  @SerializedName("strEvent")
  val nameEvent: String,
  @SerializedName("dateEvent")
  val dateEvent: String
)