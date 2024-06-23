/**
 * Solution
 * 
 * Time Complexity: O(log(min(a, b))), O(N)
 * 
 */
public class Solution {
  public static int getGCD(int a, int b) {
    if(a == 0)
      return b;
    
    if(b>a)
      return getGCD(b,a);
    return getGCD(a%b, b);
  }
  public static int lcm(int a, int b) {
    int prod = a*b;
    int gcd = getGCD(a, b);
    return prod/gcd;
  }
  public static void main(String[] args) {
    System.out.println(lcm(20, 15));
    System.out.println(lcm(3, 7));
    System.out.println(lcm(2, 8));
  }
}