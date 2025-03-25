import java.util.Random;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int minSize = 10;
        int maxSize = 10000;
        int increment = 50;

        System.out.println("n,InsertionSortTime(ns),MergeSortTime(ns)");

        for (int n = minSize; n <= maxSize; n += increment) {
        
            int[] originalArray = generateRandomArray(n);
            
            int[] arrayForInsertion = Arrays.copyOf(originalArray, originalArray.length);
            long insertionStartTime = System.nanoTime();
            InsertionSort.sort(arrayForInsertion);
            long insertionEndTime = System.nanoTime();
            long insertionDuration = insertionEndTime - insertionStartTime;

            int[] arrayForMerge = Arrays.copyOf(originalArray, originalArray.length);
            long mergeStartTime = System.nanoTime();
            MergeSort.sort(arrayForMerge);
            long mergeEndTime = System.nanoTime();
            long mergeDuration = mergeEndTime - mergeStartTime;

            System.out.println(n + "," + insertionDuration + "," + mergeDuration);
        }
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }
}