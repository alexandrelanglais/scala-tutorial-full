package fr.demandeatonton.controlsabstraction

object MyAssertV1 extends App {
  var assertionsEnabled = true

  def myAssert(predicate: () => Boolean) =
    if (assertionsEnabled && !predicate())
      throw new AssertionError

  myAssert(() => 5 > 3)
}
