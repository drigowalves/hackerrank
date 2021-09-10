import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class ResultTest {

    @Test
    public void testCaseInput00() {
        List<String> magazine = Arrays.asList("give", "me", "one", "grand", "today", "night");
        List<String> note = Arrays.asList("give", "one", "grand", "today");
        Result.checkMagazine(magazine, note);
    }

    @Test
    public void testCaseInput20() {
        List<String> magazine = Arrays.asList("two", "times", "three", "is", "not", "four");
        List<String> note = Arrays.asList("two", "times", "two", "is", "four");
        Result.checkMagazine(magazine, note);
    }

    @Test
    public void testCaseInput21() {
        List<String> magazine = Arrays.asList("ive", "got", "a", "lovely", "bunch", "of", "coconuts");
        List<String> note = Arrays.asList("ive", "got", "some", "coconuts");
        Result.checkMagazine(magazine, note);
    }

}