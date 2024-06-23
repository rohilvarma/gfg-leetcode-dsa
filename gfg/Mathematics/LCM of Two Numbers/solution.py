# Time Complexity: O(log(min(a, b))), O(N)

from math import floor


def get_gcd(a: int, b: int) -> int:
  if a==0:
    return b
  
  if b>a:
    return get_gcd(b, a)
  return get_gcd(a%b, b)

def lcm(a: int, b: int) -> int:
  gcd = get_gcd(a, b)
  prod = a*b
  return floor(prod/gcd)

if __name__ == "__main__":
  print(lcm(20, 15))
  print(lcm(3, 7))
  print(lcm(2, 8))