import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        int[] array = {50, 10, 20, 80, 40, 60, 30, 70, 90, 5};
        System.out.println("Исходный массив: " + Arrays.toString(array));

        parallelMergeSort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    public static void parallelMergeSort(int[] array) {
        if (array.length <= 1) return;

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        Thread leftSorter = new Thread(() -> parallelMergeSort(left));
        Thread rightSorter = new Thread(() -> parallelMergeSort(right));

        leftSorter.start();
        rightSorter.start();

        try {
            leftSorter.join();
            rightSorter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        merge(array, left, right);
    }

    public static void merge(int[] result, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) result[k++] = left[i++];
            else result[k++] = right[j++];
        }
        while (i < left.length) result[k++] = left[i++];
        while (j < right.length) result[k++] = right[j++];
    }
}
