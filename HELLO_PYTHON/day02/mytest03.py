# 로또 생성하기
from random import random

arr = list(range(1, 46))

# arr45 = [1,2,3,4,5]

for i in range(100):
    rnd = int(random()*len(arr))
    a = arr[0]
    b = arr[rnd]
    arr[0] = b
    arr[rnd] = a


print(arr[0:6])# 배열 자르는법[:]   

# 선생님 방식
arr45 = [
    1,2,3,4,5       ,6,7,8,9,10,
    11,12,13,14,15  ,16,17,18,19,20,
    21,22,23,24,25  ,26,27,28,29,30,
    31,32,33,34,35  ,36,37,38,39,40,
    41,42,43,44,45 
]

# arr45 = range(1,45+1)

for i in range(100):
    rnd = int(random()*len(arr45))
    a = arr45[0]
    b = arr45[rnd]
    arr45[0]=b
    arr45[rnd]=a

print(arr45[0:6])


