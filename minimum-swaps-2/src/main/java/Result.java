import java.util.List;

public class Result {

    // Complete the minimumSwaps function below.
    public static int minimumSwaps(int[] arr) {
        int size = arr.length;
        int swapCount = 0;
        for(int i=0; i < size; i++) {
            if(arr[i] != (i+1)) {
                for(int j = (i+1); j < size; j++) {
                    if(arr[j] == (i+1)){
                        swapCount++;
                        swap(arr, i, j);
                        break;
                    }
                }
            }
        }
        return swapCount;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] =  arr[b];
        arr[b] = temp;
    }

}
