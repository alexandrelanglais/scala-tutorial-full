package fr.demandeatonton.classes

class ChecksumCalculator {
  private var sum = 0;

  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0XFF) + 1
}

object ChecksumCalculator {
  def calculate(s: String): Int = {

    val acc = new ChecksumCalculator
    for (c <- s)
      acc.add(c.toByte)

    val cs = acc.checksum()
    cs
  }
}
