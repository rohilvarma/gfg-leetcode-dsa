# Time Complexity: O(logN), O(1)

from math import floor


def computing_power(x: int, y: int) -> int:
  if y==1:
    return x
  pow = computing_power(x, floor(y/2))
  if y&1==0:
    return pow*pow
  return pow*pow*x

if __name__ == "__main__":
  print(computing_power(9, 4))