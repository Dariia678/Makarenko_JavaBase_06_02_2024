package ua.hillel.makarenko.lessons.lesson16.HW16;

public class ArrayOperation {
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        double sum = 0;
        for (int num : array) {
            sum += num;
        }

        return sum / array.length;
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        for (int[] row : matrix) {
            if (row.length != rows) {
                return false;
            }
        }

        return true;
    }
}
