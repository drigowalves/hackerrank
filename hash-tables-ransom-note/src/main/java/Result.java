import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    public static void checkMagazine(List<String> magazine, List<String> note) {
        Map<String, Integer> map = new HashMap<>();
        int aux = 0;
        boolean mismatch = true;
        for (String word : magazine) {
            aux = map.containsKey(word) ? map.get(word) + 1 : 1;
            map.put(word, aux);
        }
        aux = 0;
        for (String word : note) {
            if(map.containsKey(word)) {
                aux = map.get(word) - 1;
                if(aux < 0) {
                    mismatch = false;
                    break;
                }
                map.put(word, aux);
            } else {
                mismatch = false;
                break;
            }
        }
        String result = mismatch ? "Yes" : "No";
        System.out.println(result);
    }

}
