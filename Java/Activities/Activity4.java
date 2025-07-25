package activities;

public class Activity4 {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i]; 
            int j = i - 1;
            
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] cards = {9, 5, 1, 4, 3};
        insertionSort(cards);

        System.out.println("Sorted cards:");
        for (int card : cards) {
            System.out.print(card + " ");
        }
    }
}
