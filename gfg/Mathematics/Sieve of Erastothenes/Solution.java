import java.util.ArrayList;
import java.util.Arrays;

/**
 * Solution
 * 
 * Time Complexity: O(N*log(log(N)))
 * 
 */
public class Solution {
  public static ArrayList<Integer> soe(int n) {
    boolean[] checkArr = new boolean[n+1];
    Arrays.fill(checkArr, false);

    for(int i=2 ; i*i<= n ; i++) {
      if(!checkArr[i]) {
        for(int j=2*i ; j<=n ; j+=i) {
          checkArr[j] = true;
        }
      }
    }
    ArrayList<Integer> primes = new ArrayList<>();
    for(int i=2 ; i<=n ; i++) {
      if(!checkArr[i])
        primes.add(i);
    }
    return primes;
  }
  public static void main(String[] args) {
    System.out.println(soe(15));
  }
}