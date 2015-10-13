package x.crazyjvm.decorate.s

/**
 * Created by chenchao on 15/10/12.
 */
class Decorate {

}


trait OutputStream {
  def write(b: Byte)
  def write(b: Array[Byte])
}

class FileOutputStream(path: String) extends OutputStream {
  def write(b: Byte){}
  def write(b: Array[Byte]){}
}

trait Buffering extends OutputStream {
  abstract override def write(b: Byte) {
    // ...
    //super.write(buffer)
  }
}

//new FileOutputStream("foo.txt") with Buffering // with Filtering, ...