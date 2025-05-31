import java.util.Arrays;

public class Java_02_Searching {

    public static int LinearSearch(int arr[],int key){

        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i+1;
            }
        }

        return -1;
    }

    public static int BinarySearch(int arr[],int key){
        int Start = 0;
        int End = arr.length - 1;

        while(Start <= End){
            int Mid = (Start + (End - Start)/2);

            if(arr[Mid] == key){
                return Mid;
            }else if(arr[Mid] < key){
                Start = Mid + 1;
            }else{
                Mid = End - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {

        int arr[] = {1,7,6,9,3,96,26,782,96};
        int key = 96;

        if(LinearSearch(arr,key)== -1){
            System.out.println("Not Found");
        }else{
            System.out.println(LinearSearch(arr,key));
        }

        // Sorting
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        if(BinarySearch(arr,key) == -1){
            System.out.println("Not Found");
        }else{
            System.out.println(BinarySearch(arr,key));
        }
    }
}
