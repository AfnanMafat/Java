public class Java_06_Method_OverLoading {

    public static int Sum(int a,int b){
        System.out.print("Sum(int a,int b)");
        return a+b;
    }

    public static int Sum(int a,int b,int c){
        System.out.print("Sum(int a,int b,int c)");
        return a+b+c;
    }

    public static double Sum(double a,double b){
        System.out.print("Sum(double a,double b)");
        return a+b;
    }

    public static double Sum(double a,double b,double c){
        System.out.print("Sum(double a,double b,double c)");
        return a+b+c;
    }

    public static double Sum(double a,int b){
        System.out.print("Sum(double a,int b)");
        return a+b;
    }

    public static void main(String[] args) {

        System.out.println(Sum(1,2));
        System.out.println(Sum(1,2,3));
        System.out.println(Sum(1.35,2.75));
        System.out.println(Sum(1.32,2.25,7.14));
        System.out.println(Sum(1.25,2));

    }
}
