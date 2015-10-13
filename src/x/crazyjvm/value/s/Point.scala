package x.crazyjvm.value.s

/**
 * Created by chenchao on 15/10/13.
 */
class Point {

}


object Point extends App{
  type Point = (Int, Int) // Tuple2[Int, Int]
  val point: Point = (1, 2)

//  case class Point(x: Int, y: Int)
//  val point = Point(1, 2)
}