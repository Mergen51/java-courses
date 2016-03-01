import java.util.Scanner;

/**
     класс для запуска калькулятора. Поддерживает ввод пользователя.
*/
public class InteractRunner {

     public static void main(String[] args) {
          Scanner reader = new Scanner(System.in);
          try {
               Calculator calc = new Calculator();
               String exit = "no";
               while (!exit.equals("yes")) {
                    System.out.println("Enter first arg : ");           
                    String first = reader.next();
                    System.out.println("Enter second arg : ");           
                    String second = reader.next();
                    System.out.println("Enter operation : add, deduct, multiply, divided, power"); 
                    String operation = reader.next();
                    if (operation.equals("add")) {
                         calc.add(Integer.valueOf(first), Integer.valueOf(second));
                         System.out.println("Result : " + calc.getResult());
                    } else if (operation.equals("deduct")) {
                         calc.deduct(Integer.valueOf(first), Integer.valueOf(second));
                         System.out.println("Result : " + calc.getResult());
                    } else if (operation.equals("multiply")) {
                         calc.multiply(Integer.valueOf(first), Integer.valueOf(second));
                         System.out.println("Result : " + calc.getResult());
                    } else if (operation.equals("divided")) {
                         calc.divided(Integer.valueOf(first), Integer.valueOf(second));
                         System.out.println("Result : " + calc.getResult());
                    } else if (operation.equals("power")) {
                         calc.power(Integer.valueOf(first), Integer.valueOf(second));
                         System.out.println("Result : " + calc.getResult());
                    } else System.out.println("Result unknown");
                    System.out.println("Clear result : yes/no ");
                    String clear = reader.next();
                    if (clear.equals("yes")) calc.clearResult();    
                    System.out.println("Exit : yes/no ");
                    exit = reader.next();
               }      
          } finally {
               reader.close();
          }
     }
}