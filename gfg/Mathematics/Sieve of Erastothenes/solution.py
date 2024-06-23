# Time Complexity: O(N*log(log(N)))


def soe(n: int) -> list[int]:
  res = []
  check_list = []
  for i in range(0, n+1):
    check_list.append(False)

  for i in range(2, int(n**0.5)+1):
    if check_list[i] is False:
      for j in range(2*i, n+1, i):
        check_list[j] = True

  for i in range(2, n+1):
    if check_list[i] is False:
      res.append(i)

  return res

if __name__ == "__main__":
  print(soe(19))