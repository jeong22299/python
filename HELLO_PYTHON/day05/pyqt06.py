import sys
from PyQt5.QtWidgets import *
from PyQt5 import uic

form_class = uic.loadUiType("pyqt06.ui")[0]

class MyWindow(QMainWindow, form_class):
    def __init__(self):
        super().__init__()
        self.setupUi(self)
        self.pb.clicked.connect(self.myclick)   
    
    # def myclick(self):
    #     a = self.le.text()
    #     aa = int(self.le.text())
    #     self.te.setText(
    #         "{}X{}={}".format(a, "1", str(1*aa)) + "\n" +
    #         "{}X{}={}".format(a, "2", str(2*aa)) + "\n" +
    #         "{}X{}={}".format(a, "3", str(3*aa)) + "\n" +
    #         "{}X{}={}".format(a, "4", str(4*aa)) + "\n" +
    #         "{}X{}={}".format(a, "5", str(5*aa)) + "\n" +
    #         "{}X{}={}".format(a, "6", str(6*aa)) + "\n" +
    #         "{}X{}={}".format(a, "7", str(7*aa)) + "\n" +
    #         "{}X{}={}".format(a, "8", str(8*aa)) + "\n" +
    #         "{}X{}={}".format(a, "9", str(9*aa))             
    #         )
    
# 선생님 방식(f"String")/ 3.5버전 이상에서 사용 가능   
    def myclick(self):
        dan = self.le.text()
        idan = int(self.le.text())
        txt = ""
        
        txt += f"{idan} * {1} = {idan*1}\n"
        txt += f"{idan} * {2} = {idan*2}\n"
        txt += f"{idan} * {3} = {idan*3}\n"
        txt += f"{idan} * {4} = {idan*4}\n"
        txt += f"{idan} * {5} = {idan*5}\n"
        txt += f"{idan} * {6} = {idan*6}\n"
        txt += f"{idan} * {7} = {idan*7}\n"
        txt += f"{idan} * {8} = {idan*8}\n"
        txt += f"{idan} * {9} = {idan*9}\n"
        
        self.te.setText(txt)
         
if __name__ == "__main__":
    app = QApplication(sys.argv)
    myWindow = MyWindow()
    myWindow.show()
    app.exec_()