package Array;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {14, 38, 9, 101, 82, 71, 45, 21, 252, 58, 75};
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        for(int i =0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
