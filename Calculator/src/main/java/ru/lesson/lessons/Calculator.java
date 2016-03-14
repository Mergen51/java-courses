package ru.lesson.lessons;

/**
     Класс реализует калькулятор.
*/
public class Calculator {

     /**
          резултат вычисления.
     */   
     private int result;
     
     /**
      * Суммирует аргументы.
      * @param a,b входящие параметры.
     */   
     public void add(int a, int b) {
          this.result = a + b;
     }

     /**
      * Разность аргументов.
      * @param a,b входящие параметры.
     */    
     public void deduct(int a, int b) {
          this.result = a - b;
     }

     /**
      * Метод производит умножение.
      * @param a,b входящие параметры.
     */  
     public void multiply(int a, int b) {
               this.result = a * b;
     }

     /**
      * Метод производит деление.
      * @param a,b входящие параметры.
      *@throws UserException Если произвоится деление на ноль выкидывает сообщение.
     */   
     public void divided(int a, int b) throws UserException {
          if (b != 0) {
               this.result = a / b ;
          } else {
                 throw new UserException("Error,  You can not divide by zero!");
          }
     }

     /**
      * Метод возводит в степень.
      * @param a,b входящие параметры.
     */  
     public void power(int a, int b) {
          this.result = (int) Math.pow(a, b);
     }

     /**
      * Метод возвращат результат.
     */
     public int getResult() {
          return this.result;
     }

     /**
      * Метод обнуляет результа.
     */
     public void clearResult() {
          this.result = 0;
     }
}