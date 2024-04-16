package array;
import java.io.*;

public class SecondLargest {


    public static void main(String[] args) {

        int array[] = {1,2,4,7,7,7};
        System.out.println("Second Largest element is "+findSecondLargest(array));

    }

    static int findSecondLargest(int arr[]){
        int largest=arr[0];
        int sLargest = Integer.MIN_VALUE;


        for(int i=1; i<arr.length;i++){
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];

            } else if (arr[i] > sLargest && arr[i] != largest) {
                sLargest = arr[i];

            }
        }

        return sLargest;
    }

}
