import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ResultTest {

    @Test
    public void testCaseInput00() {
        int n = 5;
        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(1, 2, 100),
                Arrays.asList(2, 5, 100),
                Arrays.asList(3, 4, 100)
        );
        long result = Result.arrayManipulation(n, queries);
        Assertions.assertEquals(200l, result);
    }

    @Test
    public void testCaseInput14() {
        int n = 10;
        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(1, 5, 3),
                Arrays.asList(4, 8, 7),
                Arrays.asList(6, 9, 1)
        );
        long result = Result.arrayManipulation(n, queries);
        Assertions.assertEquals(10l, result);
    }

    @Test
    public void testCaseInput15() {
        int n = 10;
        List<List<Integer>> queries = Arrays.asList(
                Arrays.asList(2, 6, 8),
                Arrays.asList(3, 5, 7),
                Arrays.asList(1, 8, 1),
                Arrays.asList(5, 9, 15)
        );
        long result = Result.arrayManipulation(n, queries);
        Assertions.assertEquals(31l, result);
    }
}