package fr.demandeatonton.controlsabstraction

object MyAssert extends App {
  var assertionsEnabled = true

  def myAssert(predicate: => Boolean) =
    if (assertionsEnabled && !predicate)
      throw new AssertionError

  myAssert(5 > 3)

  assertionsEnabled = false
  myAssert(5 / 0 == 0)
}
