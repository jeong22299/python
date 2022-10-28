def addminmuldiv(a,b):
    return a+b, a-b, a*b, a/b


sum, min, mul, div = addminmuldiv(4,6)

print(sum)
print(min)
print(mul)
print(div)

# 튜플!! -> 배열과 비슷함
sum1 = addminmuldiv(4,6)
print(sum1)
print(sum1[0])

