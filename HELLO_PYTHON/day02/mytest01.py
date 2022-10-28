# 첫수를 넣으세요   2
# 끝수를 넣으세요   4
# 2에서 4까지의 합은 9 입니다.

a = input("첫수를 넣으세요")
b = input("끝수를 넣으세요")
c = 0

for i in range(int(a), int(b)+1):
    c += i
print(a,"에서 ", b,"까지 합은 ", c, "입니다.")
print("{}에서 {}까지의 합은 {}입니다.".format(*a, b, c))
