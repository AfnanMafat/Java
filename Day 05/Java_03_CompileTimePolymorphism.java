class Calculator{

    void Add(int a,int b){
        System.out.println(a + b);
    }

    void Add(int a,int b,int c){
        System.out.println(a + b + c);
    }

    void Add(double a,int b,int c){
        System.out.println(a + b + c);
    }

    void Add(double a,double b){
        System.out.println(a + b);
    }
}

public class Java_03_CompileTimePolymorphism {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.Add(5,7);
        c.Add(8.25,7.54);
        c.Add(1,2,3);
        c.Add(3.25,5,7);
    }
}
