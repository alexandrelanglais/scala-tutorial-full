package fr.demandeatonton.controlsabstraction

import java.io.{File, PrintWriter}

object WithPrintWriterCurriedExample extends App {

  def withPrintWriter(file: java.io.File)(op: PrintWriter => Unit): Unit = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  withPrintWriter(new File("test.txt")) {
    writer => writer.println(new java.util.Date)
  }
}
