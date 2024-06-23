# Time Complexity: O(log(min(a, b))), O(N)

def gcd(a: int, b: int) -> int:
  if a==0:
    return b
  
  if(b>a):
    return gcd(b,a)
  return gcd(a%b, b)
if __name__ == "__main__":
  print(gcd(60, 36))