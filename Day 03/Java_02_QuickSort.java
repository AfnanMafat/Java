import java.util.Arrays;

public class Java_02_QuickSort {

    public static  void QuickSort(int a[],int low,int high){
        if(low >= high){
            return;
        }
        
        int start = low;
        int end = high;

        int mid = (start + (end - start)/2);

        int p = a[mid];

        while(start <= end){

            while(a[start] < p){
                start++;
            }

            while(a[end] > p){
                end--;
            }

            if(start <= end){
                int t = a[start];
                a[start] = a[end];
                a[end] = t;

                start++;
                end--;
            }

            QuickSort(a,start,high);
            QuickSort(a,low,end);

        }
    }
    public static void main(String[] args) {

        int a[] = {1,7,8,3,92,96,5,1,2,5,8,58,589,95,5,75,75,885,7,5,75,7,8,8,56,6,14};

        System.out.println(Arrays.toString(a));

        QuickSort(a,0,a.length-1);

        System.out.println(Arrays.toString(a));
    }
}
