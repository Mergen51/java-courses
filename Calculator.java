/**
     ����� ��������� �����������.
*/
public class Calculator {
     /**
          ��������� ����������.
     */   
     private int result;
     
     /**
          ��������� ���������.
          @param params ��������� ������������.
     */   
     public void add(int ... params) {
          for (Integer param : params) {
               this.result += param;    
               }
     }
     /** 
          ������� ���������.
          @returne ��������� ����������.
     */
     public int getResult() {
          return this.result;
     }

     /**
          �������� ���������� ����������.
     */
     public void clearResult() {
          this.result = 0;
     }
}