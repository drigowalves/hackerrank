import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        Integer[] a1 = new Integer[a.size()];
        int newRotationNumber = a.size() - d;
        int newIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            newIndex = getNewIndex(i, d, newRotationNumber);
            a1[newIndex] = a.get(i);
        }
        return Arrays.asList(a1);
    }

    private static int getNewIndex(int index, int rotation, int subRotation) {
        int newIndex = 0;
        if(index < rotation) newIndex = index + subRotation;
        else newIndex = index - rotation;
        return newIndex;
    }

}