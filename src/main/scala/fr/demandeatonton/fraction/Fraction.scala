package fr.demandeatonton.fraction

class Fraction(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val num = n / g
  val den = d / g

  def this(n: Int) = this(n, 1)
  override def toString: String = num + "/" + den

  def add(that: Fraction): Fraction =
    new Fraction(num * that.den + that.num * den, den * that.den)

  def +(that: Fraction) = add(that)

  private def gcd(a: Int, b: Int): Int = {
    if(b == 0) a else gcd(b, a % b)
  }
}
