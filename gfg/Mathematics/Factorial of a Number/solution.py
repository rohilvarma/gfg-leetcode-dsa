#  Time Complexity (Iterative): O(N), O(1)
#  Time Complexity (Recursive): O(N), O(N)

def fact_i(n: int) -> int:
  fact = 1
  while(n!=1):
    fact = fact*n
    n -= 1
  return fact

def fact_r(n: int) -> int:
  if n==1:
    return n
  return fact_r(n-1)*n

if __name__ == "__main__":
  print(fact_r(10))
  print(fact_i(10))