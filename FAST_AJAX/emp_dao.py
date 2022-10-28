import pymysql

class EmpDao:
    def __init__(self):
        self.conn = pymysql.connect(host='localhost', user='root', port=3305,
                       password='python', db='python', charset='UTF8')
        self.cur = self.conn.cursor(pymysql.cursors.DictCursor)
    
    def selects(self):
        sql = "SELECT e_id, e_name, sex, addr FROM emp"
        self.cur.execute(sql)
        rows = self.cur.fetchall()
        return rows
    
    def select(self, e_id):
        sql = f"""
            SELECT 
                e_id, 
                e_name,
                sex,
                addr 
            FROM 
                emp 
            where 
                e_id = '{e_id}'
            """ 
        self.cur.execute(sql)
        rows = self.cur.fetchall()
        return rows[0]
    
    def insert(self, e_id, e_name, sex, addr):
        sql = f"""
            insert into emp(
                e_id, e_name, sex, addr)
            values 
                ('{e_id}', '{e_name}','{sex}', '{addr}')
            """
        cnt = self.cur.execute(sql)
        self.conn.commit()  
        return cnt
    def update(self, e_id, e_name, sex, addr):   
        sql = f""" 
        update emp
        set    e_name ='{e_name}', sex ='{sex}', addr='{addr}'
        where  e_id = '{e_id}'"""
        cnt = self.cur.execute(sql)
        self.conn.commit()  
        return cnt 
    
    def delete(self, e_id):   
        sql = f""" 
        DELETE FROM EMP
        WHERE e_id = '{e_id}'"""
        cnt = self.cur.execute(sql)
        self.conn.commit()  
        return cnt
        
    def __del__(self):
        self.cur.close()
        self.conn.close()
        
if __name__ == '__main__':
    ed = EmpDao()
    cnt = ed.delete('3')
    print(cnt)
        