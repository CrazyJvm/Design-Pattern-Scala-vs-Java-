package x.crazyjvm.command.j;

/**
 * Created by chenchao on 15/10/13.
 */
public class PrintCommand implements Runnable {
    private final String s;

    PrintCommand(String s) { this.s = s; }

    public void run() {
        System.out.println(s);
    }
}
