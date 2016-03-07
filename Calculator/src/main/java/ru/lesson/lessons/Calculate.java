package ru.lesson.lessons;

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
          System.out.println("Ввеите первое число: ");
          first = Integer.parseInt(reader.readLine());
          
          System.out.println("Введите операцию: ");
          sign = reader.readLine();

          System.out.println("Введите второе число: ");
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
               result = first * 1.0 / second;
               System.out.println("Result = " + result);
          } else if (sign.equals("^")) {
               result = Math.pow(first, second);
               System.out.println("Result = " + result);
          } else
               System.out.println("Result unknown.");
     }
}