package fr.demandeatonton.tests

import org.scalatest._

import scala.collection.mutable.ListBuffer

class MatchersTest extends FlatSpec with Matchers {

  "A Matcher" should "allow to test equallity" in {
    val res = 3
    res should equal(3) // égalité personnalisable, permet de tester l'égalité
    res should === (3) // égalité personnalisable, permet de tester l'égalité et le type
    res should be (3) // égalité non-personnalisable, plus rapide
    res shouldEqual 3 // égalité personnalisable, pas de parenthèses requises
    res shouldBe 3 // égalité non-personnalisable, pas de parenthèses requises
  }

  it should "allow to test size and length" in {
    val test = "Un test"
    val list = List(1, 2, 3)

    test should have length 7
    list should have size 3
  }

  it should "allow to test Strings" in {
    val string = "Hello seven world"
    val email = "test@demandeatonton.fr"

    string should startWith ("Hello")
    string should endWith ("world")
    string should include ("seven")

    // Utilisation de regex
    string should startWith regex "Hel*o"
    string should endWith regex "wo.ld"
    string should include regex "wo.ld"

    // Full match d'une regex
    email should fullyMatch regex """^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$"""

    // Regex avec groupes
    "abbccxxx" should startWith regex ("a(b*)(c*)" withGroups ("bb", "cc"))
    "xxxabbcc" should endWith regex ("a(b*)(c*)" withGroups ("bb", "cc"))
    "xxxabbccxxx" should include regex ("a(b*)(c*)" withGroups ("bb", "cc"))
    "abbcc" should fullyMatch regex ("a(b*)(c*)" withGroups ("bb", "cc"))
  }

  it should "allow to test greater and less than" in {
    val one = 1

    one should be < 7
    one should be > 0
    one should be <= 7
    one should be >= 0
  }
}