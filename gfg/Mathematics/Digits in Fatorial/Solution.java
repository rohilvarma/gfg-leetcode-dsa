/**
 * Solution
 * 
 * Time Complexity: O(N), O(1)
 * 
 */
public class Solution {
  public int digitsInFactorial(int n) {
    // code here
    if (n < 0) {
      return 0;
    }
    if (n <= 1) {
      return 1;
    }

    double count = 0.0;
    for (int i = 2; i <= n; i++) {
      count += Math.log10(i);
    }
    count++;
    return (int) count;
  }
}