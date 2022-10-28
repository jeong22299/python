# 홀/짝을 입력하세요 홀/짝
# 나: 홀
# 컴: 홀
# 결과 : 승리
from random import random

a = input("홀/짝을 입력하세요  ")

print("나:", a)
b = random()
if b > 0.5:
    b="홀"
    print("컴: 홀")
else:
    b="짝"
    print("컴: 짝")

if a==b:
    print("결과 : 승리")
else :
    print("결과 : 패배")


#선생님 방식
# mine = input("홀/짝을 입력하세요  ")
# com = ""
# result = ""
#
# rnd = random()
# if rnd > 0.5:
#     com ="홀"
# else :
#     com = "짝"
# if com == mine:
#     result = "승리"
# else :
#     result = "패배"
#
# print("mine", mine)
# print("com", com)
# print("result", result)
    