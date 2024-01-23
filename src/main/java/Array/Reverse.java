package Array;


    public class Reverse {
        public static void main(String[] args) {
            int[] arr = {14, 38, 9, 101, 82, 71, 45, 21, 252, 58, 75};
            int swapper;
            for (int i = 0; i < arr.length / 2; i++) {
                swapper = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = swapper;
            }
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");

        }
    }
