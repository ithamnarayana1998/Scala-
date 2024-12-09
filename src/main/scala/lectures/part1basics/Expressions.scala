package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 //EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>>(right shift with zero expression)

  println(1 == x)
  // == != > >= < <= (relational operators)

  println(!(1 == x))
  // ! && ||  (boolean)

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= .......side effects
  println(aVariable)

  //INSTRUCTIONS (DO) Vs EXPRESSIONS (VALUE)
  //  instructions are executed(think Java), expressions are evaluated(Scala)
  // in Scala we'll think in terms of expressions


  //IF EXPRESSION (if in Scala is an expression
  var aCondition = false
  var aConditionedValue = if (aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  println(if (aCondition) 5 else 3)
  println(5 + 6)

  var i = 0
  val aWhile = while (i < 10)
    println(i)
    i += 1

    //NEVER USE THIS AGAIN
    //EVERYTHING in Scala is an Expression!

    val aWierdValue = (aVariable = 3) //Unit === void
    println(aWierdValue)

    // side effects: println(), whiles, reassigning
    // Code blocks
    // Code blocks in  Scala are expressions(the value of the block is the value of its last expression)
    val aCodeBlock = {
      val y = 2
      val z = y + 1

      if (z > 2) "hello" else "goodbye"
    }
    println(aCodeBlock)

    //1.difference between "hello world" Vs println("hello world")
    //Ans:"hello world" is string literal(value) and println("hello world") is an expression it does not return anything(Unit)

    //2.
    val someValue= {
      2 < 3
    }
    val someOtherValue={
      if(someValue) 239 else 986
      42
    }
    println(someValue)
    println(someOtherValue)
}