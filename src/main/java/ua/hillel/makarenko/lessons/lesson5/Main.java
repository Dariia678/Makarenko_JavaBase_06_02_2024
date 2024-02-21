package ua.hillel.makarenko.lessons.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Пример:
//        int a = 10;
//        int b = 15;

//        System.out.println(a > b);
//        System.out.println(a >= b);
//        System.out.println(a < b);
//        System.out.println(a <= b);
//        System.out.println(a == b);
//        System.out.println(a != b);

//        System.out.println(!true);
//        System.out.println(!false);

//        boolean result = a > b;
//        System.out.println("result =" + " " + result );

//        Пример:
//        String str1 = "Hello";
//        String str2 = "Hello";
//        String str3 = new String("Hello");

//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);

//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));

//        Пример:
//        int a = 10;
//        int b = 15;
//        int c = 20;

//        boolean result = a < b || a > c;
//        boolean result1 = a < b && a > c;
//        System.out.println(result);
//        System.out.println(result1);
//        boolean result3 = a < b && a > c && a < b && a > c;
//        System.out.println(result3);
//        boolean result4 = a > b && c > a;
//        System.out.println(result4);

//        Пример:
//        int a = 10;
//        int b = 15;
//        int c = 20;

//        boolean result = a > b || ++c > ++a;
//
//        System.out.println(result);
//
//        System.out.println("a = " + a);
//        System.out.println("c = " + c);

//        boolean result2 = (a > b || true) && (c < a || c > a) || true;
//        System.out.println(result2);

//        Пример:
//        int x = 5;
//
//        System.out.println(++x > 5);
//        System.out.println("x = " + x);
//        System.out.println(x++ == 5);
//        System.out.println("x = " + x);
//        System.out.println(++x != 6);
//        System.out.println("x = " + x);

//        Пример:
//        int a = 1;
//        int b = 10;

//        if (a < b) {
//            System.out.println("Hello");
//        }

//        if (a < b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a >= b");
//        }

//        Пример:
//        int a = 12;
//        int b = 12;

//        if (a > b) {
//            System.out.println("a > b");
//        } else if (a < b) {
//            System.out.println("a < b");
//        } else {
//            System.out.println("a == b");
//        }

//        Пример:
//        int a = 13;
//        int b = 10;
//
//        if (a >= b) {
//            System.out.println("a >= b");
//
//            if (a > b) {
//                System.out.println("a > b");
//            } else if (a == b) {
//                System.out.println("a == b");
//            }
//        } else {
//            System.out.println("a < b");
//        }

//        Пример:
//        BAD VERSION
//        int a = 10;
//        int b = 10;
//
//        if (a == b);
//        System.out.println("a = b");
//        System.out.println("a = b");
//        System.out.println("a = b");

//        Пример:
//        int a = 2;
//        switch (a) {
//            case 1: {
//                System.out.println("Caffee");
//                break;
//            }
//            case 2: {
//                System.out.println("Tea");
//                break;
//            }
//            case 3: {
//                System.out.println("3");
//                break;
//            }
//            case 4: {
//                System.out.println("4");
//                break;
//            }
//            default: {
//                System.out.println("default");
//            }
//        }
//        Пример:
//        String str = "QWE";
//        switch (str) {
//            case "QWE" : {
//                System.out.println(1);
//                break;
//            }
//            case "QwE" : {
//                System.out.println(2);
//                break;
//            }
//            case "Qwe" : {
//                System.out.println(3);
//                break;
//            }
//            case "qWE" : {
//                System.out.println(4);
//                break;
//            }
//        }
//        Пример:
//        char charValue = '$';
//        switch (charValue) {
//            case '#' : {
//                System.out.println("1");
//                break;
//            }
//            case '!' : {
//                System.out.println("2");
//                break;
//            }
//            case '@' : {
//                System.out.println("3");
//                break;
//            }
//            case '$' : {
//                System.out.println("4");
//                break;
//            }
//        }
//        Пример:
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter some string");

//        String strUserValue = scanner.next();

//        System.out.println("unser value = " + strUserValue);

//        String strUnserValue2 = scanner.next();
//        String strUnserValue3 = scanner.next();
//        String strUnserValue4 = scanner.next();

//        System.out.println(strUnserValue2);
//        System.out.println(strUnserValue3);
//        System.out.println(strUnserValue4);

//        Пример:
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter some string");

//        String strUserValue = scanner.nextLine();

//        System.out.println("unser value = " + strUserValue);

//        Пример:
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter some string");
//
//        int strValueInt = scanner.nextInt();
//
//        System.out.println("unser value = " + strValueInt);

//      Пример:
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter some string");

//        int strValueInt = scanner.nextInt();
//        scanner.nextLine();

//        System.out.println("unser value = " + strValueInt);

//        System.out.println("Please enter some string");

//        String strUserValue = scanner.nextLine();

//        System.out.println("unser value = " + strUserValue);

//      Пример:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter some string");
//
//        if (scanner.hasNextInt()) {
//            int strValueInt = scanner.nextInt();
//            scanner.nextLine();
//        } else {
//            System.out.println("Wrong data. Restart app");
//            System.exit(0);
//        }
    }
}