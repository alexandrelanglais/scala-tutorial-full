package fr.demandeatonton.collections

import scala.collection.immutable.HashSet

object ScalaImmutableSet extends App {
  val hashSet = HashSet("Tomates", "Concombres")

  println(hashSet + "Patates de terre")
  println(hashSet)
}
