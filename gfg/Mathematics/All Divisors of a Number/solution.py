# Time Complexity: O(√N), O(1)

from math import floor

def all_divisors(n: int) -> list[int]:
  res = []
  for i in range(1, int(n**0.5)+1):
    if n%i == 0:
      res.append(i)
      if i!=floor(n/i):
        res.append(floor(n/i))
    
  res.sort()
  return res

if __name__ == "__main__":
  print(all_divisors(25))