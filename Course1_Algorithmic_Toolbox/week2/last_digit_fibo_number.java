
import java.util.Scanner;
//BigInteger takes even big nos than long
import java.util.Scanner;
import java.math.BigInteger;

public class last_digit_fibo_number {
	private static BigInteger calc_fib(Long n) {
		if(n==0) {
			return BigInteger.ZERO;
		}else if(n==1) {
			return BigInteger.ONE;
		}else {
			BigInteger a = BigInteger.ZERO;
			BigInteger b = BigInteger.ONE;
			BigInteger ans = BigInteger.ZERO;
			for(int i=2;i<=n;i++) {
				ans = (a.add(b)).mod(BigInteger.TEN);
				a=b;
				b=ans;
			}
			return ans;
		}
    }

		  public static void main(String args[]) {
		    Scanner in = new Scanner(System.in);
		    Long n = in.nextLong();
		    BigInteger answer;
		    answer = calc_fib(n);
		    System.out.println(answer);
		    in.close();
		  }
}
