package x.crazyjvm.singleton.j;

/**
 * Created by chenchao on 15/10/12.
 */
public class Singleton {
}


class Cat implements Runnable {
    private static final Cat instance = new Cat();

    private Cat() {}

    public void run() {
        // do nothing
    }

    public static Cat getInstance() {
        return instance;
    }
}

//Cat.getInstance().run()