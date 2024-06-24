/**
 * Solution
 * 
 * Time Complexity: O(logN), O(1)
 * 
 */
public class Solution {

  double mod = 1000000007;

  public double termOfGP(int a, int b, int n) {
    // Your code here
    if (n == 1) {
      return (double) a;
    }
    return (((double) b * termOfGP(a, b, n - 1)) % mod) / a;
  }
}