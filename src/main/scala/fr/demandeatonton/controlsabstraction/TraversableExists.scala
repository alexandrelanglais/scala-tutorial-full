package fr.demandeatonton.controlsabstraction

object TraversableExists extends App {
  val list = List(1, 2, 3)
  val list2 = List(-1, 3)

  def containsNeg(l: List[Int]):Boolean = {
    var exists = false
    for(n <- l)
      if(n < 0)
        exists = true

    exists
  }

  println(containsNeg(list))
  println(containsNeg(list2))

  println(list.exists(_ < 0))
  println(list2.exists(_ < 0))

  println(list.exists(_ % 2 == 0))
  println(list2.exists(_ % 2 == 0))
}
