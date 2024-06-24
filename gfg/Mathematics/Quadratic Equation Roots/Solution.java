import java.util.ArrayList;

/**
 * Solution
 * 
 * Time Complexity: O(1), O(1)
 * 
 */
public class Solution {
  public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
    ArrayList<Integer> res = new ArrayList<>();
    double d = b * b - 4 * a * c;
    if (d < 0) {
      res.add(-1);
      return res;
    } else if (d == 0) {
      double root = -b / (2 * a);
      res.add((int) Math.floor(root));
      res.add((int) Math.floor(root));
    } else {
      double root1 = (-b + Math.sqrt(d)) / (2 * a);
      double root2 = (-b - Math.sqrt(d)) / (2 * a);
      res.add(Math.max((int) Math.floor(root1), (int) Math.floor(root2)));
      res.add(Math.min((int) Math.floor(root1), (int) Math.floor(root2)));
    }
    return res;
  }
}