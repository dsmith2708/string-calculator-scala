object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }

  def add(numbers: String): Int = {
    numbers match {
      case "" => 0
      case x if(x.contains(System.lineSeparator)) => {
        println("contains \\n")
        numbers.split(System.lineSeparator).map(_.toInt).sum
      }
      case _ => {
        println("does not contain \\n")
        numbers.split(",").map(_.toInt).sum
      }
    }
  }
}
