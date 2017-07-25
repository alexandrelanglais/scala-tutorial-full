package fr.demandeatonton.caseclasses

abstract class Expression {
  case class Sum(left: Expression, right: Expression) extends Expression
  case class Var(n: String) extends Expression
  case class Const(v: Int) extends Expression
  case class Operation(sign: String, left: Expression, right: Expression) extends Expression
}

object Calculette extends Expression {
  type Environment = String => Int

  def calculate(expr: Expression, env: Environment): Int = expr match {
    case Var(x) => env(x)
    case Const(n) => n
    case Sum(left, right) => calculate(left, env) + calculate(right, env)
    case Operation("-", left, right) => calculate(left, env) - calculate(right, env)
    case Operation("/", left, right) => calculate(left, env) / calculate(right, env)
    case Operation("*", left, right) => calculate(left, env) * calculate(right, env)
  }

  def main(args: Array[String]): Unit = {
    val env:Environment = {case "x" => 5 case "y" => 3} // Sachant que x vaut 5 et y vaut 3
    val expr = Sum(Const(4), Const(3))

    println(calculate(expr, env))

    println(calculate(Const(4), env))

    println(calculate(Sum(Const(4), Const(5)), env))

    val left = Sum(Const(4), Const(5))
    val right = Const(1000)
    println(calculate(Sum(left, right), env))

    val probleme = Sum(Sum(Var("x"), Const(3)), Sum(Var("x"), Var("y"))) // Combien font (x + 3) + (x + y)
    println(calculate(probleme, env))

    val pythagoreEnv:Environment  = {case "a" => 3 case "b" => 5 }
    val hypothenuse = calculate(Sum(Operation("*", Var("a"), Var("a")), Operation("*", Var("b"), Var("b"))), pythagoreEnv)

    println(hypothenuse)

  }
}
