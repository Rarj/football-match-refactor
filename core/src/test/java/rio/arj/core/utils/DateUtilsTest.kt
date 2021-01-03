package rio.arj.core.utils

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class DateUtilsTest {

  @Test
  fun convertSimpleDateFormat() {
    val date = "2021-01-01"
    val convertDate = DateUtils().convertSimpleDateFormat(date)
    assertEquals("01 Januari 2021", convertDate)
  }

  @Test
  fun `Simple Date Utils Should Return Empty String When Date Is Null`() {
    val date = null
    val convertDate = DateUtils().convertSimpleDateFormat(date)
    assertEquals("", convertDate)
  }

  @Test
  fun `Simple Date Utils Should Return Empty String When Date Is Empty String`() {
    val date = ""
    val convertDate = DateUtils().convertSimpleDateFormat(date)
    assertEquals("", convertDate)
  }

  @Test
  fun `Simple Date Utils Should Return  Empty String When Date Is Contains Alphabet or Exception`() {
    val date = "it should return empty string"
    val convertDate = DateUtils().convertSimpleDateFormat(date)
    assertEquals("", convertDate)
  }
}