package x.crazyjvm.command.j;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by chenchao on 15/10/13.
 */
public class Invoker {
    private final List<Runnable> history = new ArrayList<Runnable>();

    void invoke(Runnable command) {
        command.run();
        history.add(command);
    }

    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.invoke(new PrintCommand("foo"));
        invoker.invoke(new PrintCommand("bar"));
    }
}

