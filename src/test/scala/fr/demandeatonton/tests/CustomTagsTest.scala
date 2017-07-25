package fr.demandeatonton.tests

import fr.demandeatonton.tests.tags.DbTest
import org.scalatest.tagobjects.Slow
import org.scalatest.{FlatSpec, Tag}

class CustomTagsTest extends FlatSpec {

  "The Scala language" must "add correctly" taggedAs(Slow) in {
    val sum = 1 + 1
    assert(sum === 2)
  }

  it must "subtract correctly" taggedAs(Slow, DbTest) in {
    val diff = 4 - 1
    assert(diff === 3)
  }
}



