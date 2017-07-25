package fr.demandeatonton.assertions

object TestEnsuring extends App {
  def evenIt(x:Int) = {
    if(x % 2 == 0)
      x + 1 // on va faire péter ensuring !
    else
      x + 1
  } ensuring( _ % 2 == 0)

  evenIt(2)
}
