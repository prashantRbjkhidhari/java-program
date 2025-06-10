import java.util.Scanner;
public class CheckWithinRangeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to check: ");
        int x = sc.nextInt();
        System.out.print("Enter minimum: ");
        int min = sc.nextInt();
        System.out.print("Enter maximum: ");
        int max = sc.nextInt();
        if (x >= min && x <= max)
            System.out.println(x + " is within the range.");
        else
            System.out.println(x + " is not within the range.");
        sc.close();
    }
}
