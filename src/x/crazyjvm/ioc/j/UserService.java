package x.crazyjvm.ioc.j;

/**
 * Created by chenchao on 15/10/13.
 */
public class UserService {
    private final Repository repository;

    UserService(Repository repository) {
        this.repository = repository;
    }

    void create(User user) {
        // ...
        repository.save(user);
    }

    public static void main(String[] args){
        new UserService(new DatabaseRepository());
    }

}

