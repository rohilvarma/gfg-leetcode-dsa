# Time Complexity: O(d)

from math import floor, log10

def count_digits_2(n: int) -> int:
  return floor(log10(n))+1

def count_digits(n: int) -> int:
  count = 0
  while n != 0:
    n = floor(n/10)
    count += 1

  return count

if __name__ == "__main__":
  print(count_digits_2(2355500))