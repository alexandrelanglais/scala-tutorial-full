package fr.demandeatonton.controlstatements

object ScalaIf {
  def main(args: Array[String]): Unit = {

    // imperative style : utilisation d'une var
    var fileName = "default.txt"
    if(!args.isEmpty)
      fileName = args(0)

    println(fileName)

    // functional style : utilisation d'une val
    val fileName2 =
      if(!args.isEmpty) args(0)
      else "default.txt"

    println(fileName2)
  }
}
