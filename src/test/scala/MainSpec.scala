import collection.mutable.Stack
import org.scalatest._

class MainSpec extends WordSpec with Matchers {
  "The add function" when {
    "called with an empty string" should {
      "return 0" in {
        Main.add("")
      }
    }
  }
}
