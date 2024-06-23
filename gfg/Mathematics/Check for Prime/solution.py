# Time Complexity: O(√N), O(1)


def is_prime(n: int) -> bool:
  if n==1:
    return False
  if n==2 or n==3:
    return True
  
  if n%2==0 or n%3==0:
    return False
  
  for i in range(5, int(n**0.5)+1, 6):
    if n%i==0 or n%(i+2)==0:
      return False
    
  return True

if __name__ == "__main__":
  print(is_prime(19))