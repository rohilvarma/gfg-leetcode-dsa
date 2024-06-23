/**
 * Solution
 * 
 * Time Complexity: O(log(min(a, b))), O(N)
 * 
 */
public class Solution {
  public static int gcd(int a, int b) {
    if(a == 0)
      return b;
    if(b>a) 
      return gcd(b, a);
    return gcd(a%b, b);
  }
  public static void main(String[] args) {
    System.out.println(gcd(60, 36));
  }
}