/**
 * Solution
 */
public class Solution {
  public static int findTrailingZeroes(int n) {
    if(n<0)
      return 1;
    
    int count = 0;
    for(int i=5 ; i<=n ; i*=5) 
      count += (n/i);
  
    return count;
  }
  public static void main(String[] args) {
    System.out.println(findTrailingZeroes(2147));
  }
}