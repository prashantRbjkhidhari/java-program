import java.util.*;
import java.math.BigInteger;

public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int a = sc.nextInt();
        
        BigInteger factorial = BigInteger.ONE;
        for(int i=1; i<=a; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
        sc.close();
    }
}
