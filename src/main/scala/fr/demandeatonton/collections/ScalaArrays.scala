package fr.demandeatonton.collections

object ScalaArrays extends App {
  val greetStrings = new Array[String](3)
  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"

  for (i <- 0 to 2)
    print(greetStrings(i))

  // Appel implicite à la méthode update
  greetStrings.update(0, "Goodbye")
  for (i <- 0 to 2)
    print(greetStrings(i))

  // Création et initialisation
  val numNames = Array("zero", "one", "two")
  for (i <- 0 to 2)
    println(numNames(i))

  // Tableau de n'importe quoi
  val anything = Array(1, "Hello", java.math.BigDecimal.ZERO)
  for (i <- 0 to 2)
    println(anything(i).getClass)

  // Array[Any] ne correspond pas à Array[String]
//  val neCompilePas:Array[String] = Array(1, "Hello", java.math.BigDecimal.ZERO)

}
