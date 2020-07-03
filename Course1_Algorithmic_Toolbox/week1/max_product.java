import java.util.*;
import java.util.Scanner;

public class max_product {
  public  static Long product(ArrayList<Long> lst){
      Long max = 0L;
      Long secondmax = 0L;
      for(int i=0;i<lst.size();i++){
        //if current elemnt is more than the maximum element
        //update maximum and second maximum element
          if(lst.get(i)>max){
            secondmax = max;
            max = lst.get(i);
          }
          //if current elemnt is less than the max element
          //but greater than the second elemnt than update second max elemnt only
          else if(lst.get(i)>secondmax){
            secondmax = lst.get(i);
          }
      }
   return max*secondmax;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Long n = s.nextLong();
        ArrayList<Long> l = new ArrayList<Long>();
        for(int i=0;i<n;i++){
            l.add(s.nextLong());
        }
        Long answer = product(l);
        System.out.println(answer);
        s.close();
    }
}