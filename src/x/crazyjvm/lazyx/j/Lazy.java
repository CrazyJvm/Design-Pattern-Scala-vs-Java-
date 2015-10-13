package x.crazyjvm.lazyx.j;

/**
 * Created by chenchao on 15/10/6.
 */

class Component {

}

public class Lazy {
    private volatile Component component;

    public Component getComponent() {
        Component result = component;
        if (result == null) {
            synchronized (this) {
                result = component;
                if (result == null) {
                    component = result = new Component();
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
    }
}


