object Main {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
  }

  def add(numbers: String): Int = {
    numbers match {
      case "" => 0
      case x if x.take(2) == "\\\\" =>
        val delimiter: String = x.charAt(2).toString
        x.drop(4).split(delimiter).map(_.toInt).sum
      case _ => numbers.split(s"[,${System.lineSeparator()}]").map(_.toInt).sum
    }
  }
}
