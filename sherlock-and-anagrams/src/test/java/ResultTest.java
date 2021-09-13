import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {

    @Test
    public void testCase1Input00() {
        String word = "abba";
        int result = Result.sherlockAndAnagrams(word);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testCase1Input01() {
        String word = "ifailuhkqq";
        int result = Result.sherlockAndAnagrams(word);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testCase2Input01() {
        String word = "kkkk";
        int result = Result.sherlockAndAnagrams(word);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void testCaseInput06() {
        String word = "cdcd";
        int result = Result.sherlockAndAnagrams(word);
        Assertions.assertEquals(5, result);
    }

}