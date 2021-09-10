import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        List<Long> array = new ArrayList<>(Collections.nCopies(n+1, 0l));
        int a = 0;
        int b = 0;
        int k = 0;
        for (List<Integer> values : queries) {
            a = values.get(0);
            b = values.get(1);
            k = values.get(2);
            updateListPlusValue(array, a, k);
            updateListMinusValue(array, b, k);
        }
        long sum = 0l;
        long max = 0l;
        for (Long value : array) {
            sum += value;
            max = max < sum ? sum : max;
        }
        return max;
    }

    private static void updateListPlusValue(List<Long> array, int index, int k) {
        long value = array.get(index - 1) + k;
        array.set(index - 1, value);
    }

    private static void updateListMinusValue(List<Long> array, int index, int k) {
        long value = array.get(index) - k;
        array.set(index, value);
    }
}
