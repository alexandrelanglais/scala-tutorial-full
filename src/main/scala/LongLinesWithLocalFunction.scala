import scala.io.Source

object LongLinesWithLocalFunction {
  def processFile(filename: String, width: Int) {
    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(filename)

    def processLine(line: String) {
      if (line.length > width)
        println(filename + ": " + line.trim)
    }
  }
}