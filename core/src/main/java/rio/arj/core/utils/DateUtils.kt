package rio.arj.core.utils

import java.text.SimpleDateFormat
import java.util.*

class DateUtils {

  private fun isNotContainsLetter(text: String): Boolean {
    return text.matches("[^a-zA-Z]*$".toRegex())
  }

  fun convertSimpleDateFormat(dateString: String?): String {
    val isDateValid = !dateString.isNullOrEmpty() && isNotContainsLetter(dateString)
    if (isDateValid) {
      val formatPattern = SimpleDateFormat("yyyy-MM-dd", Locale("ID"))
      val dateFormatter = SimpleDateFormat("dd MMMM yyyy", Locale("ID"))
      val date = formatPattern.parse(dateString.toString()) ?: Date()
      return dateFormatter.format(date)
    }
    return ""
  }

  fun convertSimpleTimeFormat(timeString: String?): String {
    val isDateValid = !timeString.isNullOrEmpty() && isNotContainsLetter(timeString)
    if (isDateValid) {
      val formatPattern = SimpleDateFormat("hh:mm:ss", Locale("ID"))
      val dateFormatter = SimpleDateFormat("hh:mm a", Locale("ID"))
      val date = formatPattern.parse(timeString.toString()) ?: Date()
      return dateFormatter.format(date)
    }
    return ""
  }

}