import java.util.*;

public class Login {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Username: ");
        String u = s.nextLine();

        System.out.print("Password: ");
        String p = s.nextLine();

        if (u.equals("admin") && p.equals("1234"))
            System.out.println("Login Successful");
        else
            System.out.println("Invalid Login");
    }
}