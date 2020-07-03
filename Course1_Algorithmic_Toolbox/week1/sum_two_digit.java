/**
 * sum_two_digit
 */
import java.util.*;

public class sum_two_digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int sum = 0 ;
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum = a+b;
        System.out.println(sum);
        sc.close();
    }
}