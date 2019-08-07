import collection.mutable.Stack
import org.scalatest._

class MainSpec extends WordSpec with Matchers {
  "The add function" when {
    "called with an empty string" should {
      "return 0" in {
        Main.add("")
      }
    }
    "called with a string of numbers seperated by commas" should {
      "return the sum of 1,2,3" in {
        Main.add("1,2,3")
      }
    }
  }
}
