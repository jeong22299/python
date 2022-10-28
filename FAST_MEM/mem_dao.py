import pymysql

class MemDao:
    def __init__(self):
        self.conn = pymysql.connect(host='localhost', user='root', port=3305,
                       password='python', db='python', charset='UTF8')
        self.cur = self.conn.cursor(pymysql.cursors.DictCursor)
    
    def selects(self):
        sql = "SELECT m_seq, m_name, tel, army_yn FROM member"
        self.cur.execute(sql)
        rows = self.cur.fetchall()
        return rows
    
    def select(self, m_seq):
        sql = f"""
            SELECT 
                m_seq, 
                m_name,
                tel,
                army_yn 
            FROM 
                member 
            where 
                m_seq = '{m_seq}'
            """ 
        self.cur.execute(sql)
        rows = self.cur.fetchall()
        return rows[0]
    
    def insert(self, m_name, tel, army_yn):
        sql = f"""
            insert into member(
                m_name, tel, army_yn)
            values 
                ('{m_name}','{tel}', '{army_yn}')
            """
        cnt = self.cur.execute(sql)
        self.conn.commit()  
        return cnt
    
    def update(self, m_seq, m_name, tel, army_yn):   
        sql = f""" 
        update member
        set    m_name ='{m_name}', tel ='{tel}', army_yn='{army_yn}'
        where  m_seq = '{m_seq}'"""
        cnt = self.cur.execute(sql)
        self.conn.commit()  
        return cnt 
    
    def delete(self, m_seq):   
        sql = f""" 
        DELETE FROM member
        WHERE m_seq = '{m_seq}'"""
        cnt = self.cur.execute(sql)
        self.conn.commit()  
        return cnt
        
    def __del__(self):
        self.cur.close()
        self.conn.close()
        
if __name__ == '__main__':
    md = MemDao()
    cnt = md.delete('3')
    print(cnt)
        