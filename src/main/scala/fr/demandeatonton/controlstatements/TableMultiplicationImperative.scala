package fr.demandeatonton.controlstatements

/**
  * Created by langlais.alexandre on 20/07/2017.
  */
object TableMultiplicationImperative extends App {
  var i = 1

  while (i <= 10) {
    var j = 1

    while (j <= 10) {
      val prod = (i * j).toString

      var k = prod.length

      while (k < 4) {
        print(" ")
        k += 1
      }
      print(prod)
      j += 1
    }
    println()
    i += 1
  }
}
