import Main.findMiddleElement
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

class MainSpec extends AnyFlatSpec with should.Matchers {

  behavior of "Main"

  it should "find middle element in list" in {

    findMiddleElement(List(1, 2, 3, 4)) shouldBe Some(2)
    findMiddleElement(List(10, 23, 2137, 100, 420)) shouldBe Some(2137)
  }
}
