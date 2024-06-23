import java.util.ArrayList;
import java.util.Collections;

/**
 * Solution
 */
public class Solution {
  public static ArrayList<Integer> allDivisors(int n) {
    ArrayList<Integer> al = new ArrayList<>();
    for(int i=1 ; i*i<=n ; i++) {
      if(n%i == 0) {
        al.add(i);
        if(i!=n/i)
          al.add(n/i);
      }
    }
    Collections.sort(al);
    return al;
  }
  public static void main(String[] args) {
    System.out.println(allDivisors(25));
  }
}