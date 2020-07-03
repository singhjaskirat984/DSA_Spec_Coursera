import java.util.Scanner;
import java.util.*;

public class fibo {
  private static long calc_fib(long a[],long n) {
  if(n==0){
    return 0L;
  }else if(n==1){
    return 1L;
  }else{
    a[0] = 0L;
    a[1] = 1L;
    long ans;
    for(int i=2;i<a.length;i++){
      a[i] = a[i-1] + a[i-2];
    }
  }
  return a[a.length-1];
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    long[] a = new long[n+1];
    long answer;
    answer = calc_fib(a,n);
    System.out.println(answer);
  }
}
