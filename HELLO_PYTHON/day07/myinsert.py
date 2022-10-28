import pymysql
conn = pymysql.connect(host='localhost', user='root', port=3305,
                       password='python', db='python', charset='UTF8')

cur = conn.cursor()
# sql = """insert into emp(e_id, e_name, sex, addr) 
#         values('3','3','3',3)"""
# cur.execute(sql)

    # 또다른 방법
sql = """insert into emp(e_id, e_name, sex, addr)
         values (%s, %s, %s, %s)"""
cur.execute(sql, ('3','3','3','3'))
cnt = cur.execute(sql, ('4','4','4','4'))



conn.commit()   
print(cur.rowcount, cnt)
cur.close()
conn.close()