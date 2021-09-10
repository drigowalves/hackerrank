import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResultTest {

    @Test
    public void testCaseInput00() {
        int[] input = {4, 3, 1, 2};
        int result = Result.minimumSwaps(input);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testCaseInput01() {
        int[] input = {2, 3, 4, 1, 5};
        int result = Result.minimumSwaps(input);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testCaseInput02() {
        int[] input = {1, 3, 5, 2, 4, 6, 7};
        int result = Result.minimumSwaps(input);
        Assertions.assertEquals(3, result);
    }

}