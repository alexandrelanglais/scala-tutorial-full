package fr.demandeatonton.collections

import scala.collection.mutable.Map

object ScalaMutableMap extends App {
  // mutable map
  val mutableMap = Map[Int, String]()
  mutableMap += (1 -> "Ceci est")
  mutableMap += (2 -> "une")
  mutableMap += (3 -> "mutable map")

  println(mutableMap(3))
}
