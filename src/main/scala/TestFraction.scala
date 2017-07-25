import fr.demandeatonton.fraction.Fraction

object TestFraction extends App {
  // Override de toString
  val r = new Fraction(5, 2)
  println(r)

  // Constructeur auxiliaire
  val r2 = new Fraction(3)
  println(r2)

  // Réduction de fraction
  val r3 = new Fraction(4, 8)
  println(r3)

  // Addition de fractions
  val r4 = new Fraction(1, 8)
  val r5 = new Fraction(5, 8)
  println(r4.add(r5))

  // Définition d'opérateurs
  println(r4 + r5)

  // Conversion implicite
  implicit def intToFraction(x: Int) = new Fraction(x)
  println(2 + r5)

}
