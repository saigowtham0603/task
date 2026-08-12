import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.println("===== LOGIN =====");

        System.out.print("Enter Username: ");
        String u = sc.nextLine();

        System.out.print("Enter Password: ");
        String p = sc.nextLine();

        if (u.equals(username) && p.equals(password)) {
            System.out.println("\nLogin Successful!");
            System.out.println("Welcome, " + u);
            System.out.println("Opening Dashboard...");
        } else {
            System.out.println("\nInvalid username or password!");
        }

        sc.close();
    }
}