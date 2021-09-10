import java.util.List;

public class Result {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */
    public static void minimumBribes(List<Integer> q) {
        int swapCount = 0;
        for (int i = q.size() - 1; i >= 0; i--) {
            if (q.get(i) != i + 1) {
                if (((i - 1) >= 0) && q.get(i - 1) == (i + 1)) {
                    swapCount++;
                    swap(q, i, i - 1);
                } else if (((i - 2) >= 0) && q.get(i - 2) == (i + 1)) {
                    swapCount += 2;
                    swap(q, i - 2, i - 1);
                    swap(q, i - 1, i);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(swapCount);
    }

    private static void swap(List<Integer> arr, int a, int b) {
        int temp = arr.get(a);
        arr.set(a, arr.get(b));
        arr.set(b, temp);
    }

}