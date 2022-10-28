import pymysql

e_id = "3"
e_name = "5"
sex = "5"
addr = "5"

conn = pymysql.connect(host='localhost', user='root', port=3305,
                       password='python', db='python', charset='UTF8')

cur = conn.cursor()
# sql = """ 
#         update emp
#         set e_name ='4', sex ='4', addr='4'
#         where e_id = '3'"""
#

    # 다른 방식 
sql = f""" 
update emp
set e_name ='{e_name}', sex ='{sex}', addr='{addr}'
where e_id = '{e_id}'"""
cur.execute(sql)

conn.commit()   
print(cur.rowcount)     
cur.close()
conn.close()