/**
 * Solution
 * 
 * Time Complexity (Iterative): O(N), O(1)
 * Time Complexity (Recursive): O(N), O(N)
 * 
 */
public class Solution {
  public static int factorialI(int n) {
    int fact = 1;
    while(n!=1) {
      fact *= n;
      n--;
    }
    return fact;
  }
  public static int factorialR(int n) {
    if(n==1)
      return n;
    return factorialR(n-1)*n;
  }
  public static void main(String[] args) {
    System.out.println(factorialI(10));
    System.out.println(factorialR(10));
  }
}