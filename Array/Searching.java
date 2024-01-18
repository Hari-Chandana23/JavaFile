package Array;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {14, 38, 9, 101, 82, 71, 45, 21, 252, 58, 75};
        int searchElement = 45,i;
        for( i=0;i<arr.length;i++)
            if(arr[i]==searchElement){
                System.out.println("elemenent found at index "+ (i+1));
                break;
            }
        if(i==arr.length)
            System.out.println("Element not found..");
    }
}
