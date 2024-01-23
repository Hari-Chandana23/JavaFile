package Array;

public class Rotate {

        public static void main(String[] args) {
            int[] arr = {75,58,252,21,45,71,82,101,9,38,14 };
            int rotatePlace = 2;
            int rotatedArray[] = new int[arr.length];
            int index=0,i;
            for(i=rotatePlace;i<arr.length;i++){
                rotatedArray[index]=arr[i];
                index++;
            }
            for(i=0;i<rotatePlace;i++){
                rotatedArray[index]=arr[i];
                index++;
            }

            for(i=0;i<rotatedArray.length;i++)
                System.out.print(rotatedArray[i]+" ");
        }
    }

