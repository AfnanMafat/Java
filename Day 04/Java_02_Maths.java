public class Java_02_Maths {

    public static boolean IsPrime(int num){
        if(num <= 1){
            return false;
        }
        {

            int C = 2;

            while (C * C <= num) {
                if (num % C == 0){
                    return false;
                }
                C++;
            }

            return true;
        }
    }

    public static boolean IsOddEven(int n){

        if((n & 1) == 0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int Num = 10007;

        System.out.println(IsPrime(Num));

        int Num2 = 6;
        System.out.println(IsOddEven(Num2));
    }
}
