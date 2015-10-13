package x.crazyjvm.nullvalue.s

/**
 * Created by chenchao on 15/10/13.
 */

trait Sound {
  def play()
}

class Music extends Sound {
  def play() { /* ... */ }
}

object SoundSource {
  def getSound: Option[Sound] =
    //if (available) Some(music) else None
    null
}


object Main extends App{
  for (sound <- SoundSource.getSound)
    sound.play()
}
