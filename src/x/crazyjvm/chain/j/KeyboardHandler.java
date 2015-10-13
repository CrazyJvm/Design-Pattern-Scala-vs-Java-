package x.crazyjvm.chain.j;

/**
 * Created by chenchao on 15/10/13.
 */

public class KeyboardHandler extends EventHandler { // MouseHandler...
    protected boolean canHandle(Event event) {
        return "keyboard".equals(event.getSource());
    }

    protected void doHandle(Event event) { /* ... */ }
}