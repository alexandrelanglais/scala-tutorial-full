package fr.demandeatonton.classes

class MyRectangle(xPos:Int, yPos:Int, w: Int, h: Int) {
  val x = xPos
  val y = yPos
  val width = w
  val height = h

  println("Created Rectangle of width and height " + width + "x" + height + " at " + x + ":" + y)

  def this(w:Int, h: Int) = this(0, 0, w, h);
}
