import pymysql

conn = pymysql.connect(host='localhost', user='root', port=3305,
                       password='python', db='python', charset='UTF8')
cur = conn.cursor(pymysql.cursors.DictCursor)

sql = "SELECT * FROM emp"
cur.execute(sql)
rows = cur.fetchall()
print(rows)  
   
cur.close()
conn.close()