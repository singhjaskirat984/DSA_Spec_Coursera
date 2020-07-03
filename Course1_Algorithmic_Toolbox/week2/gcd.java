import java.util.Scanner;

public class gcd {
	public static long Efficient_Gcd(long a,long b) {
		if(b==0) {
			return a;
		}
		long rem = a % b;
		return Efficient_Gcd(b,rem);
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long ans = 0L;
		ans = Efficient_Gcd(a,b);
		System.out.println(ans);
		s.close();
		}

}