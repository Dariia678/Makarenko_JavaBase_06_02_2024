package ua.hillel.makarenko.lessons.lesson16.HW16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationsTest {
    @Test
    public void testCalculateAverage() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(3.0, ArrayOperation.calculateAverage(array));
    }

    @Test
    public void testIsSquareMatrix() {
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertTrue(ArrayOperation.isSquareMatrix(squareMatrix));

        int[][] nonSquareMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        assertFalse(ArrayOperation.isSquareMatrix(nonSquareMatrix));
    }
}
