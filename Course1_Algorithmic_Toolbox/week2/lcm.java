import java.util.Scanner;

public class lcm {
	public static long calculate_gcd(long a,long b) {
		if(b==0) {
			return a;
		}
		long remainder = a % b;
		return calculate_gcd(b,remainder);
	}

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		long a = Scan.nextLong();
		long b = Scan.nextLong();
		long ans = 0L;
		ans = calculate_gcd(a,b);
		long final_ans = (a*b)/ans;
		System.out.println(final_ans);
		Scan.close();
		}

}
