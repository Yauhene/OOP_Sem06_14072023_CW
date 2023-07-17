package homework;

public class UserSaver implements Saveable {
    public User user;
    public UserSaver() {
    }

    public void saveUser(User user) {
        System.out.println("Save user:  id " + user.getId() + "  name " + user.getName());
    }
}
