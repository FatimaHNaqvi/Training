package Basics;

import java.util.Scanner;

public class SalaryCalculator {
     public static void main(String[] args) {
          System.out.println(fact(4));
     }

     public static int fact(int n) {
          if (n==0){

               return 1;
          }
          System.out.println(n);
          return n*fact(n-1);

     }
}
