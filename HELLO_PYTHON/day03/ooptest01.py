class Animal:
    
    def __init__(self):
        self.hungry = 5
    
    def timegoby(self):
        if self.hungry > 0 :
            self.hungry -= 1

    def manttang(self):
        self.hungry = 10
        
# ani = Animal()
# print(ani.hungry)
# ani.timegoby()
# ani.manttang()
# print(ani.hungry)

class Human(Animal):
    
    def __init__(self):
        super(Human,self).__init__()
        self.skill_lang = 0
    
    def momstouch(self, stroke):
        self.skill_lang += stroke

hum = Human()
print(hum.skill_lang);
print(hum.hungry);
hum.timegoby()
hum.momstouch(5)
print(hum.hungry);
print(hum.skill_lang);
