package fr.demandeatonton.controlstatements

/**
  * Created by langlais.alexandre on 20/07/2017.
  */
object TableMultiplication extends App {
  val maxPadding = 4

  def mkRow(i: Int, j:Int) = {
    val row =
      for(n <- 1 to j) yield {
        val prod = (i * n).toString
        val padding = " " * (maxPadding - prod.length)
        prod + padding
      }
    row.mkString
  }

  def mkTable(i: Int) = {
    val table =
      for(n <- 1 to i)
        yield mkRow(n, i)

    table.mkString("\n")
  }

  println(mkTable(12))
}
