import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(long a[],long n) {
    a[0] = 0L;
    a[1] = 1L;
    for(i=2;i<n;i++){
      a[i] = a[i-1] + a[i-2];
    }
    return a;
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    long n = in.nextLong();
    long a[];
    a = new long[n];
    long answer[];
    answer = calc_fib(a,n);
    for(int i=0;i<n;i++){
      system.out.println(answer[i]);
    }
  }
}
