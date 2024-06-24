/**
 * Solution
 * 
 * Time Complexity: O(1), O(1)
 * 
 */
public class Solution {

  public static long sumUnderModulo(long a, long b) {
    // code here'
    long mod = 1000000007;
    return (a % mod + b % mod) % mod;
  }
}