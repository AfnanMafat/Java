import java.util.Arrays;

public class Java_01_MergeSort {

   public static int[] MergeSort(int a[]){
       if(a.length == 1){
           return a;
       }

       int mid = a.length / 2;

       int left[] = MergeSort(Arrays.copyOfRange(a,0,mid));
       int right[] = MergeSort(Arrays.copyOfRange(a,mid,a.length));

       return Merge(left,right);
   }

   public static int[] Merge(int left[],int right[]){
       int ans[] = new int[left.length + right.length];

       int i=0;
       int j=0;
       int k=0;

       while(i<left.length && j < right.length){
           if(left[i] < right[j]){
               ans[k] = left[i];
               i++;
               k++;
           }else{
               ans[k] = right[j];
               j++;
               k++;
           }
       }

       while(i < left.length){
           ans[k] = left[i];
           i++;
           k++;
       }

       while(j < right.length){
           ans[k] = right[j];
           j++;
           k++;
       }


       return ans;
   }
    public static void main(String[] args) {

       int a[] = {1,7,8,3,92,96,58,56,6,14};

        System.out.println(Arrays.toString(a));

        a = MergeSort(a);

        System.out.println(Arrays.toString(a));

    }
}
