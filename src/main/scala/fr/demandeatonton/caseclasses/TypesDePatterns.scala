package fr.demandeatonton.caseclasses

object TypesDePatterns extends App {

  // Pattern qui match des constantes
  def define(x: Any): String = x match {
    case true => "vrai"
    case 2 => "un deux"
    case Nil => "une liste vide"
    case _ => "autre chose"
  }

  println(define(true))
  println(define(2))
  println(define(Nil))
  println(define(false)) // autre chose

  // Pattern de variables
  def varPattern(x: Any): String = x match {
    case 0 => "Zero"
    case anythingElse => "On a autre chose que 0 : " + anythingElse
  }

  println(varPattern(5))

  // Pattern de séquence
  def seqPattern(list: Any): String = list match {
    case List("Hello", _, _) => "On a un match"
    case _ => "KO"
  }

  println(seqPattern(Nil)) // KO
  println(seqPattern(List("Hello", "world"))) // KO
  println(seqPattern(List("Hello", "world", "!"))) // Match

  // Pattern de type
  def typePattern(x: Any) = x match {
    case s:String => s.length
    case l:List[_] => l.size
    case m:Map[_, _] => m.size
    case _ => -1
  }

  println(typePattern("Hello!"))
  println(typePattern(List(1, 2, 3)))
  println(typePattern(Map(1 -> "A", 2 -> "B")))

}
