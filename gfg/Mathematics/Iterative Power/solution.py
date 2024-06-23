# Time Complexity: O(logN), O(1)


def iterative_power(x: int, y: int) -> int:
  res = 1
  while y>0:
    if y&1==1:
      res = res*x
    y = y>>1
    x = x*x
  return res
if __name__ == "__main__":
  print(iterative_power(5, 4))