package x.crazyjvm.ioc.s

/**
 * Created by chenchao on 15/10/13.
 */

class User{}

object Main extends App{
  trait Repository {
    def save(user: User){}
  }
  trait DatabaseRepository extends Repository { /* ... */ }

  trait UserService { self: Repository => // requires Repository
    def create(user: User) {
      // ...
      save(user)
    }
  }

  new UserService with DatabaseRepository
}
