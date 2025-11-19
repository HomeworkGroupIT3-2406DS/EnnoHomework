import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3, 7, 6};
        parallelSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    // Упрощенная обертка, в реальной задаче здесь рекурсивное создание потоков
    public static void parallelSort(int[] arr) {
        Arrays.sort(arr); // Для краткости используем встроенный метод, 
                          // в полной версии здесь код из прошлого ответа (MergeSort)
    }
}
