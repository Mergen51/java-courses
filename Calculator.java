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