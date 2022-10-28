# 구구단을 만드시오

# for i in range(2, 9+1):
#     for j in range(1, 9+1):
#         if i % 2 ==0:
#             print("{}*{}={}".format(i, j, i*j))


# 선생님 방식 ==> 짝수만 출력
for i in range(2, 9+1):
    if i%2 == 1:
        continue
    for j in range(1, 9+1):
            print("{}*{}={}".format(i, j, i*j))



# print("{}*{}={}".format(2, 1, 2*1))
