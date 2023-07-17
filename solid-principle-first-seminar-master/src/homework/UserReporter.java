package homework;

public class UserReporter implements Reportable{
    public User user;
    public UserReporter() {
    }

    public void reportUser(User user) {
        System.out.println("Report for user:  id " + user.getId() + "  name " + user.getName());
        }
    }


