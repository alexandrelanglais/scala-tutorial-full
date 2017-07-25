package fr.demandeatonton.collections

object ScalaCollections extends App {
  // Creation et initialisation
  val oneTwoThree = List(1, 2, 3)

  oneTwoThree.foreach(s => println(s))

  // Concaténation de listes
  val fourFiveSix = List(4, 5, 6)
  val concatenation = oneTwoThree ::: fourFiveSix

  concatenation.foreach(s => { print(s); print(" ") })

  println()

  val zeroOneTwoThree = 0 :: oneTwoThree
  zeroOneTwoThree.foreach(s => { print(s); print(" ") })

  println()

  val l = Nil

  val nilList = 1 :: 2 :: 3 :: Nil

  // Ajouter un élément en fin de liste
  val appended = nilList :+ 4
  appended.foreach(s => { print(s); print(" ") })

  println()

  // Meilleur ajout d'un élément en fin de liste
  val appendedNicely = (4 :: nilList.reverse).reverse
  appendedNicely.foreach(s => { print(s); print(" ") })

  println()

  // Utilisation d'un tuple
  val carte = (10, "pique")
  println(carte._1)
  println(carte._2)

  // Utilisation d'un set immutabl
  var kaSet = Set("Audio", "Video")
  kaSet += "Blueray"
  println(kaSet.contains("Blueray"))

  // déclaré en val
  val immutableSet = Set("Audio", "Video")
//  immutableSet += "Blueray" // erreur de compilation : réassignation de variable

  // déclaré en val
  val specifiedImmutableSet:scala.collection.mutable.Set[String] = scala.collection.mutable.Set("Audio", "Video")
  specifiedImmutableSet += "Blueray" // erreur de compilation : réassignation de variable



}
