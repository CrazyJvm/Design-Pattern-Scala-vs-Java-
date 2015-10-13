package x.crazyjvm.command.s

/**
 * Created by chenchao on 15/10/13.
 */

object Invoker extends App{
  private val history: Seq[() => Unit] = Seq.empty

  def invoke(command: => Unit) { // by-name parameter
    command
    history :+ command _
  }

  Invoker.invoke(println("foo"))

  Invoker.invoke {
    println("bar 1")
    println("bar 2")
  }
}
