package x.crazyjvm.lazyx.s


/**
 * Created by chenchao on 15/10/12.
 */
class Lazy {

}

object Lazy extends App{
  lazy val x = {
    print("(computing x) ")
    42
  }

  print("x = ")
  println(x)
}