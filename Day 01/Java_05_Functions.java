public class Java_05_Functions {

    public static  void Greet(){
        System.out.println("Hello World");
    }

    public static void Sum(int a,int b){
        System.out.println("Sum : " + (a+b));
    }

    public static int SumRetu(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {

        Greet();

        int a = 5,b = 7;
        Sum(a,b);

        System.out.println(SumRetu(5,3));
    }
}
