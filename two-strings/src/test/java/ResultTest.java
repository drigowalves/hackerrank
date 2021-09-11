import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultTest {
    private final String RESULT_YES = "YES";
    private final String RESULT_NO = "NO";

    @Test
    public void testCase1Input00() {
        String s1 = "hello";
        String s2 = "world";
        String result = Result.twoStrings(s1, s2);
        Assertions.assertEquals(RESULT_YES, result);
    }

    @Test
    public void testCase2Input00() {
        String s1 = "hi";
        String s2 = "world";
        String result = Result.twoStrings(s1, s2);
        Assertions.assertEquals(RESULT_NO, result);
    }

    @Test
    public void testCase1Input06() {
        String s1 = "wouldyoulikefries";
        String s2 = "abcabcabcabcabcabc";
        String result = Result.twoStrings(s1, s2);
        Assertions.assertEquals(RESULT_NO, result);
    }

    @Test
    public void testCase2Input06() {
        String s1 = "hackerrankcommunity";
        String s2 = "cdecdecdecde";
        String result = Result.twoStrings(s1, s2);
        Assertions.assertEquals(RESULT_YES, result);
    }

    @Test
    public void testCase3Input06() {
        String s1 = "jackandjill";
        String s2 = "wentupthehill";
        String result = Result.twoStrings(s1, s2);
        Assertions.assertEquals(RESULT_YES, result);
    }

    @Test
    public void testCase4Input06() {
        String s1 = "writetoyourparents";
        String s2 = "fghmqzldbc";
        String result = Result.twoStrings(s1, s2);
        Assertions.assertEquals(RESULT_NO, result);
    }

    @Test
    public void testCase1Input07() {
        String s1 = "aardvark";
        String s2 = "apple";
        String result = Result.twoStrings(s1, s2);
        Assertions.assertEquals(RESULT_YES, result);
    }

    @Test
    public void testCase2Input07() {
        String s1 = "beetroot";
        String s2 = "sandals";
        String result = Result.twoStrings(s1, s2);
        Assertions.assertEquals(RESULT_NO, result);
    }

}