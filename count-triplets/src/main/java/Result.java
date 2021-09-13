import java.util.ArrayList;
import java.util.List;

public class Result {

    // Complete the countTriplets function below.
    public static long countTriplets(List<Long> arr, long r) {
        return 0l;
    }

    private static long secondTerm(long fisrtTerm, long r) {
        return fisrtTerm * Long.valueOf(String.valueOf(Math.pow(r,2-1))).longValue();
    }

    private static long thirdTerm(long fisrtTerm, long r) {
        return fisrtTerm * Long.valueOf(String.valueOf(Math.pow(r,3-1))).longValue();
    }

}
