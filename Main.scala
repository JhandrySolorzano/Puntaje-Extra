
package Clase07
import rx._

object Main extends App {
  val a = Var(1)
  val b = Var(2)

  val c = Rx{ a() + b () }
  val d = Rx{ c() + 5  }
  val e = Rx{ c() + 4 }
  val f = Rx{ d() + e () + 4 }

  println(f.now)
  a() = 3
  println(f.now)
}

object  Main1 extends App{
  val a = Var(1)
  var count = 0
  val o = a.trigger {
    count = a.now + 1
  }
  println(count)
  a() = 4
  println(count)
}

object Main2 extends App {
  val a = Var(1)
  var count = 0
  val o = a.trigger {
    count = a.now + 1
  }
  println(count)
  a() = 4
  println(count)

}


object Main3 extends App {
  val a = Var(1)
  var count = 0
  val o = a.trigger {
    count = count + 1
  }
  println(count)
  a() = 4
  println(count)

}

object Main4 extends App {
  val a = Var(1)
  var count = 0
  val o = a.triggerLater {
    count = count + 1
  }
  println(count)
  a() = 4
  println(count)

}

object Main5 extends App{
  val a = Var(1)
  val b = Rx{ 2 * a() }
  var target = 0
  val o = b.trigger{
    target = b.now
  }
  println(target)
  a()= 2
  println(target)
  b.kill()
  a() = 3
  println(target)

}