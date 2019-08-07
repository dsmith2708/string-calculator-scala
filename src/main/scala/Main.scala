object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }

  def add(numbers: String): Int = {
    numbers match {
      case "" => 0
      case _ => {
        numbers.split(",").map(_.toInt).sum
      }
    }
  }
}
