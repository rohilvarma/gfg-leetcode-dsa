/**
 * Solution
 * 
 * Time Complexity: O(d)
 * 
 */
public class Solution {
  public static int countDigits_2(int n) {
    return (int)Math.log10(n)+1;
  }
  public static int countDigits(int n) {
    int count = 0;
    while(n!=0) {
      n/=10;
      count++;
    }
    return count;
  }
  public static void main(String[] args) {
    System.out.println(countDigits_2(23532300));
  }
}