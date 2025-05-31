import java.util.Arrays;

public class Java_03_Sorting {

    public static  void BubbleSort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length - i;j++){
                if(a[j] < a[j-1]){
                    int Temp = a[j];
                    a[j]  = a[j-1];
                    a[j-1] = Temp;
                }
            }
        }
    }

    public static  void SelectionSort(int a[]){
        for(int i=0;i< a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] > a[j]){
                    int Temp = a[i];
                    a[i] = a[j];
                    a[j] = Temp;
                }
            }
        }
    }

    public static void InsertionSort(int arr[]){
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    int Temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = Temp;
                }else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,7,6,9,3,96,26,782,96};

        System.out.println(Arrays.toString(arr));

        BubbleSort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));

        SelectionSort(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));

        InsertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
