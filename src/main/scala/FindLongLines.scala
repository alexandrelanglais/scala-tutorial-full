
object FindLongLines extends App {
  val fileName = "src/main/scala/LongLines.scala"

  LongLines.processFile(fileName, 50)

}
