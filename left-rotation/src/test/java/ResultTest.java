import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ResultTest {

    @Test
    public void testInputCase00() {
        List<Integer> listInputNumbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> listOutputNumbers = Arrays.asList(5, 1, 2, 3, 4);
        int numberRotations = 4;
        List<Integer> listOutputNumbersResult = Result.rotLeft(listInputNumbers, numberRotations);
        Assertions.assertArrayEquals(listOutputNumbers.toArray(), listOutputNumbersResult.toArray());
    }

    @Test
    public void testInputCase01() {
        List<Integer> listInputNumbers = Arrays.asList(41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51);
        List<Integer> listOutputNumbers = Arrays.asList(77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77);
        int numberRotations = 10;
        List<Integer> listOutputNumbersResult = Result.rotLeft(listInputNumbers, numberRotations);
        Assertions.assertArrayEquals(listOutputNumbers.toArray(), listOutputNumbersResult.toArray());
    }

    @Test
    public void testInputCase10() {
        List<Integer> listInputNumbers = Arrays.asList(33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97);
        List<Integer> listOutputNumbers = Arrays.asList(87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60);
        int numberRotations = 13;
        List<Integer> listOutputNumbersResult = Result.rotLeft(listInputNumbers, numberRotations);
        Assertions.assertArrayEquals(listOutputNumbers.toArray(), listOutputNumbersResult.toArray());
    }

}