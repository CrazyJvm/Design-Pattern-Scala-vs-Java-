package x.crazyjvm.chain.j;

/**
 * Created by chenchao on 15/10/13.
 */
public abstract class EventHandler {
    private EventHandler next;

    void setNext(EventHandler handler) { next = handler; }

    public void handle(Event event) {
        if (canHandle(event)) doHandle(event);
        else if (next != null) next.handle(event);
    }

    abstract protected boolean canHandle(Event event);
    abstract protected void doHandle(Event event);
}

class Event{
    public String getSource(){
        return "";
    }
}