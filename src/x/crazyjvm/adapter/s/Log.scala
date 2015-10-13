package x.crazyjvm.adapter.s

import java.util.logging.Level

/**
 * Created by chenchao on 15/10/12.
 */

trait Log {
  def warning(message: String)
  def severe(message: String)
}

final class Logger {
  def log(level: Level, message: String) { /* ... */ }
}

object Logger{
  implicit class LoggerToLogAdapter(logger: Logger) extends Log {
    def warning(message: String) { logger.log(Level.WARNING, message) }
    def severe(message: String) { logger.log(Level.SEVERE, message) }
  }

  val log: Log = new Logger()
  //log.warning("")
  //log.severe("")

}


