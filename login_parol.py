import random
random.randint(1, 10)
x = random.randint(1, 10)

y = x
while y != int(input("chislo")):
    print("ne to")
else:
    print("pravilno", x)
