import java.util.Scanner;
public class PrintIntegersMNMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M: ");
        int m = sc.nextInt();
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        for (int i = m; i <= n; i++) System.out.print(i + " ");
        System.out.println();
        sc.close();
    }
}
