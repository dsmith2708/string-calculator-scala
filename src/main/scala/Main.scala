object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }

  def add(numbers: String): Int = {
    numbers match {
      case "" => 0
      case _ => {
        numbers.split("[," + System.lineSeparator + "]").map(_.toInt).sum
      }
    }
  }
}
