package ua.hillel.makarenko.lessons.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Пример:
//        int[][] array = new int[3][5];
//        array[0][0] = 55;
//        Объяснение, как можно напечатать
//        System.out.println(array);
//        System.out.println(Arrays.deepToString(array));

//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        Пример:
//        int[][] array = new int[3][5];
//        array[0][0] = 55;
//        Всегда хранит значение в первых скобках length
//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(Arrays.toString(array[0]));
//        Пример:
//        int[][] array = new int[3][5];
//        array[0][0] = 55;
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        Пример:
//        int[][] array = new int[3][5];
//        array[0][0] = 55;
//        или
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) (Math.random() * 11);
//            }
//        }
//        или
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) (Math.random() * 11);
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        Пример: Двомірні масиви
//        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        Пример: Зубчасті масиви
//        int[][] array = {
//                {1},
//                {},
//                {7, 8, 9},
//                {2, 3, 4, 5, 6, 7, 8},
//                {2, 3}
//        };
//
//        System.out.println("row count = " + array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);
//        System.out.println(array[2].length);
//        System.out.println(array[3].length);
//        System.out.println(array[4].length);
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        Пример: символ и слова
//        char[][] charArray = {
//                {'a', 'b'},
//                {'c', 'd'}
//        };
//        for (int i = 0; i < charArray.length; i++) {
//            for (int j = 0; j < charArray[i].length; j++) {
//                System.out.print(charArray[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        String[][] stringArray = {
//                {"Hello", "World"},
//                {"I", "love", "Java"}
//        };
//        for (int i = 0; i < stringArray.length; i++) {
//            for (int j = 0; j < stringArray[i].length; j++) {
//                System.out.print(stringArray[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        Створити масив розміром 5х5.
//        Заповнити масив за допомогою циклу таким чином, щоб одиниця у кожному рядку зміщувалась вправо
//        1 0 0 0 0  // 00
//        0 1 0 0 0  // 11
//        0 0 1 0 0  // 22
//        0 0 0 1 0  // 33
//        0 0 0 0 1  // 44

//        0 1 2 3 4

//        0 0 0 0 1  // 04
//        0 0 0 1 0  // 13
//        0 0 1 0 0  // 22
//        0 1 0 0 0  // 31
//        1 0 0 0 0  // 40

//        Первый вид
//        int [][] array = new int[5][5];

//        Версия 1
//        int counter = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == counter && j == counter) {
//                    array[i][j] = 1;
//                }
//            }
//            counter++;
//        }
//        Версия 2
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//            }
//        }
//        Версия 3
//        for (int i = 0; i < array.length; i++) {
//            array[i][i] = 1;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        Второй вид
//        int [][] array = new int[5][5];

//        Версия 1
//        for (int i = 0; i < array.length; i++) {
//            for (int j = array[i].length - 1; j >= 0; j--) {
//                array[i++][j] = 1;
//            }
//        }
//        Версия 2
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i + j == array.length - 1) {
//                    array[i][j] = 1;
//                }
//            }
//        }
//        Версия 3
//        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
//            array[i][j] = 1;
//        }
//        Версия 4
//        for (int i = 0; i < array.length; i++) {
//            array[i][array.length - 1 - i] = 1;
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }

//        За допомогою циклів створити шахівницю 8х8 виду
//
//        0 1 2 3 4 5 6 7
//        B W B W B W B W  // 00, 02, 04, 06
//        W B W B W B W B  // 11, 13, 15, 17
//        B W B W B W B W  // 20, 22, 24, 26
//        W B W B W B W B  // 31, 33, 35, 37
//        B W B W B W B W  //
//        W B W B W B W B  //
//        B W B W B W B W  //
//        W B W B W B W B  //

//        char[][] chess = new char[8][8];
//
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess.length; j++) {
//                if ((i + j) % 2 == 0) {
//                    chess[i][j] = 'B';
//                } else {
//                    chess[i][j] = 'W';
//                }
//            }
//        }
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
//                System.out.print(chess[i][j] + "\t");
//            }
//            System.out.println();
//        }

//       Пример: Денарный оператор
//        int x = 5;
//
//        if (x == 5) {
//            System.out.println("Yes!");
//        } else {
//            System.out.println("No!");
//        }
//        умова ? дія 1 : дія 2
//        System.out.println((x == 5) ? "Yes!" : "No!");

//        Пример: по использованию
//        int x = 5;
//        int y = 6;
//        int result = -1;
//
//        if (x <= y) {
//
//            if (x == y) {
//                result = 1;
//            } else {
//                result = 2;
//            }
//
//        } else {
//            result = 0;
//        }
//
//        result = (x <= y) ? (x == y) ? 1 : 2 : 0;
//        Пример: как применить
//        char[][] chess = new char [8][8];
//
//        for (int i = 0; i < chess.length; i++) {
//            for (int j = 0; j < chess[i].length; j++) {
//                chess[i][j] = ((i +j) % 2 == 0) ? 'B' : 'W';
//            }
//        }
//        Пример:
//        int[][][] array = new int[3][2][4];
//
//        System.out.println(array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[0][0].length);
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    array[i][j][k] = (int) (Math.random() * 101);
//                }
//            }
//        }
//        System.out.println(Arrays.deepToString(array));
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//            System.out.println();
//        }
//        Пример: Зубчасті масиви
//        int[][][] array = {
//                {
//                        {1, 2, 3},
//                        {2},
//                        {},
//                        {1, 2, 3}
//                },
//                {
//                        {1},
//                        {},
//                        {1, 2, 3, 4},
//                        {1, 2, 3}
//                },
//                {
//                        {1}
//                }
//        };
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k] + "\t");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//        Пример:
//        int[][][] array = {
//                {
//                        {18, 28, 18, 28},
//                        {45, 90, 45, 0}
//                },
//                {
//                        {7, 125, 500, 5},
//                        {0, 11, 25, 30}
//                },
//                {
//                        {81, 17, 19, 55},
//                        {1, 7, 38, 11}
//                }
//        };
//
//        int[][] dim0 = array[0];
//
//        for (int i = 0; i < dim0.length; i++) {
//            for (int j = 0; j < dim0[i].length; j++) {
//                System.out.print(dim0[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int[] dim0row0 = array[0][0];
//
//        System.out.println(Arrays.toString(dim0row0));
//        Пример: 4
//        int[][][][] array =
//                {
//                        {
//                                {
//                                        {18, 28},
//                                        {45, 90, 45}
//                                },
//                                {
//                                        {7, 125, 500, 5},
//                                        {}
//                                },
//                                {
//                                        {81, 17, 19, 55},
//                                        {1}
//                                }
//                        },
//                        {
//                                {
//                                        {18, 28, 18, 28},
//                                        {45, 90, 45, 0}
//                                },
//                                {
//                                        {7, 125, 500, 5},
//                                        {0, 11, 25, 30}
//                                },
//                                {
//                                        {81, 17, 19, 55},
//                                        {1, 7, 38, 11}
//                                }
//                        }
//                };
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    for (int l = 0; l < array[i][j][k].length; l++) {
//                        System.out.print(array[i][j][k][l] + "\t");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//        Пример: 5
//        int[][][][][] fiveDimArray = {
//                {
//                        {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}},
//                        {{{9, 10}, {11, 12}}, {{13, 14}, {15, 16}}}
//                },
//                {
//                        {{{17, 18}, {19, 20}}, {{21, 22}, {23, 24}}},
//                        {{{25, 26}, {27, 28}}, {{29, 30}, {31, 32}}}
//                }
//        };
//
        // Виведення значень п'ятивимірного масиву
//        for (int i = 0; i < fiveDimArray.length; i++) {
//            for (int j = 0; j < fiveDimArray[i].length; j++) {
//                for (int k = 0; k < fiveDimArray[i][j].length; k++) {
//                    for (int l = 0; l < fiveDimArray[i][j][k].length; l++) {
//                        for (int m = 0; m < fiveDimArray[i][j][k][l].length; m++) {
//                            int value = fiveDimArray[i][j][k][l][m];
//                            System.out.println("fiveDimArray[" + i + "][" + j + "][" + k + "][" + l + "][" + m + "] = " + value);
//                        }
//                    }
//                }
//            }
//        }
//    }
//        Пример: 5
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введіть кількість рядків M: ");
//        int M = 0;
//
//        while (true) {
//            if (scanner.hasNextInt()) {
//                M = scanner.nextInt();
//                if (M >= 0 && M <= 10) {
//                    break;
//                } else {
//                    System.out.println("Потрібно вести невід'ємне число.");
//                    scanner.nextLine();
//                }
//            } else {
//                System.out.println("Виникла помилка.");
//                scanner.nextLine();
//            }
//        }
//        System.out.print("Введіть кількість стовпців N: ");
//        int N = 0;
//
//        while (true) {
//            if (scanner.hasNextInt()) {
//                N = scanner.nextInt();
//                if (N >= 0 && N <= 10) {
//                    break;
//                } else {
//                    System.out.println("Потрібно вести невід'ємне число.");
//                    scanner.nextLine();
//                }
//            } else {
//                System.out.println("Виникла помилка.");
//                scanner.nextLine();
//            }
//        }
//        int[][] matrixM = new int[M][N];
//        for (int i = 0; i < M; i++) {
//            for (int j = 0; j < N; j++) {
//                System.out.print("Введіть елемент [" + i + "][" + j + "]: ");
//                matrixM[i][j] = scanner.nextInt();
//            }
//        }
//
//        int[][] matrixN = new int[N][M];
//        for (int j = 0; j < N; j++) {
//            for (int i = 0; i < M; i++) {
//                matrixN[j][i] = matrixM[i][j];
//                matrixN[i][j] = scanner.nextInt();
//            }
//        }
//
//        System.out.println("Початкова матриця M x N:");
//        for (int[] row : matrixM) {
//            for (int val : row) {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }
//
//        System.out.println("\nТранспонована матриця N x M:");
//        for (int[] row : matrixN) {
//            for (int val : row) {
//                System.out.print(val + " ");
//            }
//            System.out.println();
//        }
//        scanner.close();
//    }
//}
    }
}


