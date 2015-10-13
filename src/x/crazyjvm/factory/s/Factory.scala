package x.crazyjvm.factory.s

/**
 * Created by chenchao on 15/10/6.
 */
class Factory {

}

trait Animal
private class Dog extends Animal
private class Cat extends Animal

object Animal {
  def apply(kind: String) = kind match {
    case "dog" => new Dog()
    case "cat" => new Cat()
  }
}

object Factory extends App {
  Animal("dog")
}


