import java.util.Scanner;
public class LoginSystemMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUser = "admin";
        String correctPass = "password123";
        System.out.print("Enter username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        if (user.equals(correctUser) && pass.equals(correctPass))
            System.out.println("Login successful!");
        else
            System.out.println("Invalid credentials!");
        sc.close();
    }
}
