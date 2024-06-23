from math import floor

def find_trailing_zeroes(n: int) -> int:
  count = 0
  i=5
  while i<=n:
    count += floor(n/i)
    i = i*5

  return count

if __name__ == "__main__":
  print(find_trailing_zeroes(2147))