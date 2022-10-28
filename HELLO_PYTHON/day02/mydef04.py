from random import random

def getLotto():
    arr6 = list(range(1, 46))
    for i in range(100):
        rnd = int(random()*len(arr6))
        a = arr6[0]
        b = arr6[rnd]
        arr6[0] = b
        arr6[rnd] = a    
    return arr6[0:6]



arr6 = getLotto()
print(arr6)




