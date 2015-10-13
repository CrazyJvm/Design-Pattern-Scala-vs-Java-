package x.crazyjvm.strategy.s

/**
 * Created by chenchao on 15/10/13.
 */
object Main extends App{
  type Strategy = (Int, Int) => Int

  class Context(computer: Strategy) {
    def use(a: Int, b: Int)  { computer(a, b) }
  }

  val add: Strategy = _ + _
  val multiply: Strategy = _ * _

  new Context(multiply).use(2, 3)
}
