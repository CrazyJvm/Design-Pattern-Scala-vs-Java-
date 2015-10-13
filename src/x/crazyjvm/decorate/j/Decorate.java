package x.crazyjvm.decorate.j;

/**
 * Created by chenchao on 15/10/12.
 */
public class Decorate {
}

class FileOutputStream implements OutputStream {
    public void write(byte b){}
    public void write(byte[] b){}
}

abstract class OutputStreamDecorator implements OutputStream {
    protected final OutputStream delegate;

    protected OutputStreamDecorator(OutputStream delegate) {
        this.delegate = delegate;
    }

    public void write(byte b) { delegate.write(b); }
    public void write(byte[] b) { delegate.write(b); }
}

class BufferedOutputStream extends OutputStreamDecorator {
    public BufferedOutputStream(OutputStream delegate) {
        super(delegate);
    }

    public void write(byte b) {
        // ...
        //delegate.write(buffer)
    }
}

//new BufferedOutputStream(new FileOutputStream("foo.txt"))