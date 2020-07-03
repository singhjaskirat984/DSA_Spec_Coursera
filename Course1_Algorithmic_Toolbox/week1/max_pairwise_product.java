import java.util.*;
import java.util.Scanner;

public class max_pairwise_product {
  public  static Long product(ArrayList<Long> lst){
      Long max = lst.get(lst.size()-1);
      Long secondmax = lst.get(lst.size()-2);
   return max*secondmax;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Long n = s.nextLong();
        ArrayList<Long> l = new ArrayList<Long>();
        for(int i=0;i<n;i++){
            l.add(s.nextLong());
        }
        Collections.sort(l);
        Long answer = product(l);
        System.out.println(answer);
        s.close();
    }
}