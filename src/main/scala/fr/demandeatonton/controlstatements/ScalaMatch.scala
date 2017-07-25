package fr.demandeatonton.controlstatements

/**
  * Created by langlais.alexandre on 21/07/2017.
  */
object ScalaMatch {
  def main(args: Array[String]): Unit = {
    val firstArg = if(args.length > 0) args(0) else ""

    firstArg match {
      case "rouge" => println("red")
      case "vert" => println("green")
      case "bleu" => println("blue")
      case _ => println("meh")
    }

    val traduction =
      firstArg match {
        case "rouge" => "red"
        case "vert" => "green"
        case "bleu" => "blue"
        case _ => "meh"
      }
    println(traduction)
  }
}
