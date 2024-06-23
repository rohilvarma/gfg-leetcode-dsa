from math import floor

def is_palindrome(n: int) -> bool:
  rev = 0
  temp = n
  while n!=0:
    rev = rev*10 + n%10
    n = floor(n/10)
  return rev == temp

if __name__ == "__main__":
  print(is_palindrome(123454321))