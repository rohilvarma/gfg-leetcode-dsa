# Time Complexity: O(√N), O(1)

from math import floor


def prime_factors(n: int) -> list[int]:
  res = []
  
  while n%2==0:
    res.append(2)
    n = floor(n/2)

  while n%3==0:
    res.append(3)
    n = floor(n/3)

  for i in range(5, int(n**0.5)+1, 6):
    while n%i==0:
      res.append(i)
      n = floor(n/i)
    while n%(i+2)==0:
      res.append(i+2)
      n = floor(n/(i+2))
      
  # Incase a prime number is left that only has one power, so it wasn't counted 
  # in the super loop. However since we handled the cases for 2 & 3 the remanant
  # number should fall in this case.
  if n>3:
    res.append(n)
  return res
    
if __name__ == "__main__":
  print(prime_factors(1092))
