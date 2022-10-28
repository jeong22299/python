import pymysql

e_id = "3"

conn = pymysql.connect(host='localhost', user='root', port=3305,
                       password='python', db='python', charset='UTF8')

cur = conn.cursor()
sql = """ 
        delete from emp
        where e_id = '3'"""
        
    # 다른 방식 
# sql = f""" 
# delete emp
# where e_id = '{e_id}'"""

cur.execute(sql)
conn.commit()
   
print(cur.rowcount)     
cur.close()
conn.close()