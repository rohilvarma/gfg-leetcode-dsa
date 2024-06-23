/**
 * Solution
 * 
 * Time Complexity: O(logN), O(1)
 * 
 */
public class Solution {
  public static int iterative_power(int x, int y) {
    int res = 1;
    while(y>0) {
      if((y&1)==1) {
        res *= x;
      }
      y>>=1;
      x *= x;
    }
    return res;
  }
  public static void main(String[] args) {
    System.out.println(iterative_power(5, 4));
  }
}