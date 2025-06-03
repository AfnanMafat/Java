public class Java_01_Recursion {

    public static int Fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return (Fib(n-1) + Fib(n-2));
    }

    public static long Fact(long n){
        if(n==0){
            return 1;
        }

        return n * Fact(n-1);
    }

    public static int BS(int a[],int Start,int End,int Key){

        if(Start > End){

            return -1;
        }

        int Mid = (Start + (End - Start)/2);

        if(a[Mid] == Key){

            return Mid;
        }

        if(a[Mid] < Key){
            return BS(a,Mid + 1,End,Key);
        }

        return BS(a,Start,Mid-1,Key);
    }

    public static void NTo1(int n){
        if( n == 1){
            System.out.println(n);
            return;
        }

        System.out.print(n + " ");
        NTo1(--n);
    }

    public static int Sum(int n){
        if(n == 1){
            return 1;
        }

        return n + Sum(n -1);
    }

    public static int SumofD(int n,int Sum){
        if(n <= 0){
            return Sum;
        }

        int Digit = n % 10;

        return SumofD(n/10,Sum+=Digit);
    }

    public static int Reverse(int n,int Rev){
        if(n <= 0){
            return Rev;
        }

        int Last = n % 10;
        Rev = Rev * 10 + Last;

        return Reverse(n/10,Rev);
    }
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            System.out.print(Fib(i) + " ");
        }

        long Num = 5;
        System.out.println("\nFact : "+Fact(Num));

        int arr[] = {0,1,2,3,4,5,6,7,8,9};

        System.out.println(BS(arr,0,arr.length-1,7));

        int n = 10;
        NTo1(n);

        int SumN = 10;
        System.out.println(Sum(SumN));

        int Digit = 7253515;
        System.out.println(SumofD(Digit,0));

        System.out.println(Reverse(Digit,0));
    }
}
