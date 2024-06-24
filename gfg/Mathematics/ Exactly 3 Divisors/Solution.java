/**
 * Solution
 * 
 * Time Complexity: O(N1/2 * N1/4), O(1)
 * 
 */
public class Solution {

  public boolean isPrime(int n) {
    if (n <= 3) {
      return n > 1;
    }
    if (n % 2 == 0 || n % 3 == 0)
      return false;

    for (int i = 5; i * i <= n; i += 6) {
      if (n % i == 0 || n % (i + 2) == 0) {
        return false;
      }
    }
    return true;
  }

  public int exactly3Divisors(int N) {
    // Your code here
    int count = 0;
    for (int i = 2; i * i <= N; i++) {
      if (isPrime(i)) {
        count++;
      }
    }
    return count;
  }
}