import collection.mutable.Stack
import org.scalatest._

class MainSpec extends WordSpec with Matchers {
  "The add function" when {
    "called with an empty string" should {
      "return 0" in {
        Main.add("") shouldBe 0
      }
    }
    "called with a string of 3 numbers separated by commas" should {
      "return the sum of 1,2,3" in {
        Main.add("1,2,3") shouldBe 6
      }
      "return the sum of 3,4,5" in {
        Main.add("4,5,6") shouldBe 15
      }
    }
    "called with a string of an unknown amount of numbers separated by commas" should {
      "return the sum of 1,2,3,4,5,6" in {
        Main.add("1,2,3,4,5,6") shouldBe 21
      }
    }
  }
}
