package sorting;

/**
 * Created by esuv on 1/13/19
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 35, -2, 12, -23};

        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (array[i] > array[lastUnsortedIndex]) swap(array, i, lastUnsortedIndex);
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void swap(int[] arr, int i, int j) {
        if (arr[i] == arr[j]) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
