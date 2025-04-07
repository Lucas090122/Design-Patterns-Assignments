import java.util.Arrays;
import java.util.Random;

public class Main {

    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(1000); // 0~999的随机整数
        }
        return arr;
    }

    public static void sortAndMeasure(SortContext context, int[] arr, String sortName) {
        int[] arrCopy = Arrays.copyOf(arr, arr.length); // 保证每种排序用的是同一个初始数组
        long start = System.nanoTime();
        context.executeSort(arrCopy);
        long end = System.nanoTime();
        System.out.println(sortName + " took " + (end - start) / 1_000_000.0 + " ms");
        System.out.println("Sorted array: " + Arrays.toString(arrCopy));
        System.out.println();
    }

    public static void main(String[] args) {
        // small array
        int[] smallArray = generateRandomArray(30);

        System.out.println("Original array: " + Arrays.toString(smallArray));
        System.out.println();

        SortContext context = new SortContext(new BubbleSort());
        sortAndMeasure(context, smallArray, "Bubble Sort");

        context.setSortStrategy(new InsertionSort());
        sortAndMeasure(context, smallArray, "Insertion Sort");

        context.setSortStrategy(new SelectionSort());
        sortAndMeasure(context, smallArray, "Selection Sort");

        // large array
        int[] largeArray = generateRandomArray(10000);

        System.out.println("Original array: " + Arrays.toString(largeArray));
        System.out.println();

        context.setSortStrategy(new BubbleSort());
        sortAndMeasure(context, largeArray, "Bubble Sort");

        context.setSortStrategy(new InsertionSort());
        sortAndMeasure(context, largeArray, "Insertion Sort");

        context.setSortStrategy(new SelectionSort());
        sortAndMeasure(context, largeArray, "Selection Sort");
    }
}
