package ua.hillel.makarenko.lessons.lesson16;

import org.junit.jupiter.api.*;

public class TestArrayUtil {
    static int[] array = null;

    @BeforeAll
    static void beforeAll() {
        System.out.println("BEFORE ALL");
        array = new int[]{1, 2, 3, 4, 5};
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BEFORE EACH");
        array[0] = (int) (Math.random() * 10);
    }

    @Test
    void testMethod1() {
        System.out.println("test method 1");
        int indexElement = ArrayUtil.getIndexElement(null, 10);
        Assertions.assertEquals(-3, indexElement);
    }

    @Test
    @Disabled("IT WILL BE FIX LATER")
    void testMethod2() {
        System.out.println("test method 2");
        int indexElement = ArrayUtil.getIndexElement(new int[0], 10);
        Assertions.assertEquals(-2, indexElement);
    }

    @Test
    void testMethod3() {
        System.out.println("test method 3");
        int indexElement = ArrayUtil.getIndexElement(array, 10);
        Assertions.assertEquals(-1, indexElement);
    }

    @Test
    void testMethod4() {
        System.out.println("test method 4");
        int indexElement = ArrayUtil.getIndexElement(array, 2);
        Assertions.assertEquals(1, indexElement);
    }

    @AfterEach
    void afterEach() {
        System.out.println("AFTER EACH");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AFTER ALL");
        array = null;
    }
}
