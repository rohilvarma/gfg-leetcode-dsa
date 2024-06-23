/**
 * Solution
 * 
 * Time Complexity: O(logN), O(1)
 * 
 */
public class Solution {
  public static int power(int x, int y) {
    if(y == 1)
      return x;
    int pow = power(x, y/2);
    if((y&1)==0)
      return pow*pow;
    return pow*pow*x;
  }
  public static void main(String[] args) {
    System.out.println(power(9, 4));
  }
}