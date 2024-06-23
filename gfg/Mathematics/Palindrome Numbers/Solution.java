/**
 * Solution
 * 
 * Time Complexity: O(d)
 * 
 */
public class Solution {
  public static boolean isPalindrome(int n) {
    long rev = 0;
    int temp = n;
    while(n!=0) {
      rev = rev*10 + n%10;
      n/=10;
    }
    if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
      return false;
    
    return rev == temp;
  }
  public static void main(String[] args) {
    System.out.println(isPalindrome(2147483647));
    System.out.println(isPalindrome(-2147483648));
  }
}