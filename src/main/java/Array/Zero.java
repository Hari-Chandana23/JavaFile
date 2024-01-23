package Array;

public class Zero {

    public static void main(String[] args) {
        int[] arr = {14, 38, 9, 101, 0, 82, 71, 45, 21, 252, 58, 75, 0};
        int somewhere =0;
        int result[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                continue;
            }
            result[somewhere++] = arr[i];
        }

        for(int i=0;i<result.length;i++)
            System.out.print(result[i]+" ");
    }
}
