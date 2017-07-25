package fr.demandeatonton.tests

import org.scalatest.FlatSpec

class IgnoredTest extends FlatSpec {

  "An empty Set" should "have size 0" ignore {
    assert(Set.empty.size == 0)
  }

  ignore should "produce NoSuchElementException when head is invoked" in {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}