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

     public void deduct(int a, int b) {
          this.result = a - b;
     }

     public void multiply(int a, int b) {
          this.result = a * b;
     }
  
     public void divided(int a, int b) {
          this.result = a / b;
     }

     public void power(int a, int b) {
          this.result = (int) Math.pow(a, b);
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