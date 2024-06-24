/**
 * Solution
 * 
 * Time Complexity: O(1), O(1)
 * 
 */
public class Solution {

  static long multiplicationUnderModulo(long a, long b) {
    // add your code here
    long mod = 1000000007L;
    return ((a % mod) * (b % mod)) % mod;
  }
}