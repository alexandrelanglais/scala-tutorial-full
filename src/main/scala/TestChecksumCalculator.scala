import fr.demandeatonton.classes.{ChecksumCalculator}

object TestChecksumCalculator {
  def main(args: Array[String]): Unit = {
    val cs = ChecksumCalculator.calculate("Hello world!")

    println(cs)
  }
}
