import java.util.Arrays;

public class Java_01_Arrays {

    public static void main(String[] args) {

        // Array Creation 1st Way
        int arr[] = new int[10];

        // Array Creation 2nd Way
        int arr2[] = {1,2,3,4,5,6};

        // Multi D 1st
        int arr3[][] = new int[3][3];

        // Multi D 2nd
        int arr4[][] = {{1,2,3},{4,5,6},{7,8,9}};

        // To String
        System.out.println(Arrays.toString(arr2));

        // Length
        System.out.println(arr.length);

        // Stream
        System.out.println(Arrays.stream(arr2));

    }
}
