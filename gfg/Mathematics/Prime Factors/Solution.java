import java.util.ArrayList;

/**
 * Solution
 * 
 * Time Complexity: O(√N), O(1)
 * 
 */
public class Solution {
  public static ArrayList<Integer> primeFactors(int n) {
    ArrayList<Integer> factors = new ArrayList<>();
    while(n%2==0) {
      factors.add(2);
      n/=2;
    }
    while(n%3==0) {
      factors.add(3);
      n/=3;
    }
    for(int i=5 ; i*i<=n ; i+=6) {
      while(n%i==0) {
        factors.add(i);
        n/=i;
      }
      while(n%(i+2)==0) {
        factors.add(i);
        n/=(i+2);
      }
    }
    if(n>3)
      factors.add(n);
    return factors;
  }
  public static void main(String[] args) {
    System.out.println(primeFactors(90));
  }
}