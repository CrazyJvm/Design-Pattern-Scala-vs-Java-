package x.crazyjvm.factory.j;

/**
 * Created by chenchao on 15/10/6.
 */


class Dog implements Animal {}

class Cat implements Animal {}


class AnimalFactory {
    public static Animal createAnimal(String kind) {
        if ("cat".equals(kind)) return new Cat();
        if ("dog".equals(kind)) return new Dog();
        throw new IllegalArgumentException();
    }
}

public class Factory {
    public static void main(String[] args) {
        AnimalFactory.createAnimal("dog");
    }
}
