package billing;

public class AuthService {

    public static void register(String username, String password) {
        User user = new User(username, password);
        FileManager.saveUser(user);
    }

    public static boolean login(String username, String password) {
        return FileManager.checkLogin(username, password);
    }
}