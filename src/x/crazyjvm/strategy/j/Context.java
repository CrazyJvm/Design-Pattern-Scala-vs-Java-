package x.crazyjvm.strategy.j;

/**
 * Created by chenchao on 15/10/13.
 */
public class Context{
    private final Strategy strategy;

    public Context(Strategy strategy) { this.strategy = strategy; }

    public void use(int a, int b) { strategy.compute(a, b); }

    public static void main(String[] args){
        new Context(new Multiply()).use(2, 3);
    }
}
