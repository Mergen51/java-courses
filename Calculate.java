import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
     public static void main(String[] args) throws IOException {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          int first;
          String sign;
          int second;
          double result;

          System.out.println("Calculate...");
          System.out.println("¬ведите первое число: ");
          first = Integer.parseInt(reader.readLine());
          
          System.out.println("¬ведите знак: ");
          sign = reader.readLine();

          System.out.println("¬ведите второе число: ");
          second = Integer.parseInt(reader.readLine());
          
          
          if (sign.equals("+")) {
               result = first + second;
               System.out.println("Result = " + result);
          } else if (sign.equals("-")) {
               result = first - second;
               System.out.println("Result = " + result);
          } else if (sign.equals("*")) {
               result = first * second;
               System.out.println("Result = " + result);         
          } else if (sign.equals("/")) {
               result = first / second;
               System.out.println("Result = " + result);
          } else if (sign.equals("^")) {
               result = Math.pow(first, second);
               System.out.println("Result = " + result);
          } else
               System.out.println("Result unknown.");
     }
}