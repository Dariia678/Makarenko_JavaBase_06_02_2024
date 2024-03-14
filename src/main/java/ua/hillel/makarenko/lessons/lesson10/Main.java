package ua.hillel.makarenko.lessons.lesson10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        printHelloWorld();
//        printHelloName("Den");
//        String dar = "Dariia";
//        printHelloNameAndSurname(dar, "Makarenko");

//        printSum(5,10);

//         int[] arr = {1, 2, 3, 4, 5};
//         printArray(arr);

//        System.out.println("after ");
//        System.out.println(Arrays.toString(arr));

//        demo(1, 1.1, "sdf", 'd', new int[]{1, 2, 3});
//        int randomNumber = gerRandomNumber();
//        System.out.println(randomNumber);

//        System.out.println(gerRandomNumber());

//        printSum(gerRandomNumber(), gerRandomNumber());

//        System.out.println(getSum(10, 10));

//        printVarArgs(7, 1, 2, 3, 4, 5, 6, 7, 8, 9);

//        System.out.println(sum(2, 5));
//        System.out.println(sum(1, 2.2));
//        System.out.println(sum(1.1, 2.2));
//        System.out.println(sum(4, 6, 7));
//        System.out.println(sum(4, 8, 2, 7));

//        demoReturnVoidMethod(3);

//        System.out.println(demoReturnMethod(6));

//        demoBadRecursion();

//        3! = 1 * 2 * 3;
//        5! = 1 * 2 * 3 * 4 * 5;

//        int result = 1;
//        for (int i = 1; i <= 5; i++) {
//            result *= i;
//        }
//        System.out.println(result);

//        System.out.println(getFactorial(5));

//        System.out.println(evclide(12, 3));
    }

    static void demo1 () {
        int x = 10;
        System.out.println(x);
    }

//    По формуле
    static int evclide(int n, int m) {
        if (n == m) {
            return n;
        } else if (n > m) {
            return evclide(n - m, m);
        } else {
            return evclide(n, m - n);
        }
    }

     static int getFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * getFactorial(number - 1);
     }

     // BAD RECURSION!!!!!!!!!!
//    static void demoBadRecursion() {
//        System.out.println("egsfsdc");
//        demoBadRecursion();
//    }
    
    static int demoReturnMethod(int x) {
         if (x == 2) {
            return 2;
        } else if (x == 3) {
            return 3;
        } else {
            return 777;
        }
    }

    static void demoReturnVoidMethod(int x) {

        if (x == 2) {
            return;
        }
        System.out.println("nein");
    }

    static double sum(int a, double b) {
        return a + b;
    }

    static double sum(double a, double b){
        return a + b;
    }

    static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int a, int b) {
       return a + b;
    }

    static void printVarArgs(int x, int... varArgs) {
        System.out.println(Arrays.toString(varArgs));
    }

    static int getSum(int a, int b) {
        int c = 20;
        return getSumDemo(a, b, c);
    }

    static int getSumDemo(int a, int b, int c){
        return a + b + c;
    }
    static int gerRandomNumber() {

        int random = (int) (Math.random() * 11);
        return random;

//        return (int) (Math.random() * 11);
    }

      static void demo(int x, double y, String str, char ch, int[] array) {

      }
     static void printArray(int[] array) {
         array[0] = 77;
         for (int i = 0; i < array.length; i++) {
             System.out.println(array[i]);
         }
     }                                           
     static void printSum (int a, int b) {
         System.out.println(a+ b);
     }
     static void printHelloWorld() {
        System.out.println("Hello World");
    }

    static void printHelloName(String name) {
        System.out.println("Hello " + name);
    }

    static void printHelloNameAndSurname(String name, String surname) {
        System.out.println("Hello " + name + " " + surname);
    }
}