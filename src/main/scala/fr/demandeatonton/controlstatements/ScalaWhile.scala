package fr.demandeatonton.controlstatements

/**
  * Created by langlais.alexandre on 20/07/2017.
  */
object ScalaWhile extends App {
  var line = ""
/*
  do {
    line = readLine()
    println("Read: " + line)
  } while (line != "")
*/
  readInput()
  def readInput(): Unit = {
    val line = readLine()
    println("Read: " + line)
    if(line != "") readInput()
  }
}
