import os
from sys import argv, exit

def create_folders(dir_list: list[str]) -> None:
  for dir_name in dir_list:
    os.mkdir(dir_name)
    os.chdir(dir_name)
    os.system("touch Solution.java solution.py")
    os.chdir("../")
  print("Directories created successfully!")

def parent_dir_exists(parent_dir: str) -> None:
  try:
    os.chdir(parent_dir)

  except Exception:
    os.mkdir(parent_dir)
    os.chdir(parent_dir)

if __name__ == "__main__":
  dir_list = []
  if len(argv)>1:
    loc = argv[1]
    parent_dir = argv[2]
    dir_list = argv[3].split(",")

    if loc == "gfg":
      os.chdir("./gfg")
    else:
      os.chdir("./leetcode")

  parent_dir_exists(parent_dir)

  if len(dir_list) == 0:
    print("List Empty!")
    exit()

  create_folders(dir_list)