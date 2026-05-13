package billing;

import java.io.*;

public class FileManager {

    public static void saveUser(User user) {
        try {
            FileWriter fw = new FileWriter("users.txt", true);
            fw.write(user.getUsername() + "," + user.getPassword() + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error saving user!");
        }
    }

    public static boolean checkLogin(String username, String password) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("users.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(username) && data[1].equals(password)) {
                    return true;
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file!");
        }
        return false;
    }
}