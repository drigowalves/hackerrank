import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Result {

    public static int sherlockAndAnagrams(String s) {
        // Write your code here
        Map<String, Integer> anagrams = new HashMap<>();
        String word;
        int ans = 0;
        int subNumber = 0;
        for (int i = 1; i < s.length(); i++) {
            for(int j = 0; (i+j) < s.length()+1; j++) {
                word = sortString(s.substring(j, i+j));;
                if(anagrams.containsKey(word))
                    anagrams.put(word, anagrams.get(word) + 1);
                else
                    anagrams.put(word, 1);
                subNumber = anagrams.get(word);
                ans -= ((subNumber-1)*(subNumber-2))/2;
                ans += (subNumber*(subNumber-1))/2;
            }
        }
        return ans;
    }

    private static String sortString(String text) {
        char[] tempArray = text.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

}
