/**
     класс реализует калькулятор.
*/
public class Calculator {
     /**
          результат вычисления.
     */   
     private int result;
     
     /**
          Суммируем аргументы.
          @param params Аргументы Суммирования.
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
          Получит результат.
          @returne результат вычисления.
     */
     public int getResult() {
          return this.result;
     }

     /**
          Очистить результаты вычисления.
     */
     public void clearResult() {
          this.result = 0;
     }
}