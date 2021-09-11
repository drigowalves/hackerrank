import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Result {

    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
        boolean commonSubString = false;
        List<Character> array = new ArrayList<>();
        commonSubString = (toInt(s1) & toInt(s2)) > 0;
        return commonSubString ? "YES" : "NO";
    }

    private static int toInt(String str) {
        int res = 0;
        for (int i = 0; i < str.length(); i++)
            res |= 1 << (str.charAt(i) - 'a');
        return res;
    }

}
