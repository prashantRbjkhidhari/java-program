mport java.util.*;
public class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int a = sc.nextInt();
        
        long factorial = 1;
        for(int i=1; i<=a; i++){
            factorial *= i;
        }
        System.out.println(factorial);
        sc.close();
    }
}
// long =19 digit only
//that why 99 showing 0
//for greater then 19 use BigInteger 
