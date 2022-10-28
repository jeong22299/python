import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic
from random import random

form_class = uic.loadUiType("pyqt07.ui")[0]

class MyWindow(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)   
        self.le_mine.returnPressed.connect(self.myclick)
        
    def myclick(self):
        mine = self.le_mine.text()
        com = ""
        result = ""
        game = random()
        
        if game > 0.66:
            com ="가위"
        elif game > 0.33:
            com = "바위"
        else :
            com = "보"    
        
        if com == mine: result = "비김"
        
        if com=="가위" and mine=="보" : result = "패배"
        if com=="바위" and mine=="가위" : result = "패배"
        if com=="보" and mine=="바위" : result = "패배"
            
        if com=="보" and mine=="가위" : result = "승리"
        if com=="바위" and mine=="보" : result = "승리"
        if com=="가위" and mine=="바위" : result = "승리"
        
        self.le_com.setText(com)
        self.le_result.setText(result)

if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()