import fr.demandeatonton.classes.MyRectangle

object TestMyRectangle extends App {
  val r = new MyRectangle(10, 20, 15, 25)
  println(r.x)

  val r2 = new MyRectangle(15, 25)
  println(r2.x)

}
