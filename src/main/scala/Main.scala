object Main {
  def main(args: Array[String]): Unit = {
    println(Main.add("\\\\~\n1~5~6~7"))
  }

  @throws(classOf[NegativeNumberNotAllowedException])
  def add(numbers: String): Int = {
    numbers match {
      case "" => 0
      case x if x.take(2) == "\\\\" =>
        val delimiter: String = x.charAt(2).toString
        x.drop(4).split(delimiter).map( x => {
          val num = x.toInt
          if (num >= 0) num
          else {
            throw NegativeNumberNotAllowedException(s"$num is a negative number")
          }
        } ).sum
      case _ => numbers.split(s"[,${System.lineSeparator()}]").map(x => {
         val num = x.toInt
        if(num >= 0) num
        else {
          throw NegativeNumberNotAllowedException(s"$num is a negative number")
        }
      }).sum
    }
  }
}

final case class NegativeNumberNotAllowedException(private val message: String = "",
                                 private val cause: Throwable = None.orNull)
  extends Exception(message, cause)
