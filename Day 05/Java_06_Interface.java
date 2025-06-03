interface AInterface{

    // int a; // Error
    /*
    AInterface(){  // Error

    }
    */

    public void Compulsury();
    abstract public void Compulsury2();
}

class Cls implements AInterface{

    public void Compulsury(){
        System.out.println("C1");
    }

    public void Compulsury2(){
        System.out.println("C2");
    }
}

public class Java_06_Interface {

    public static void main(String[] args) {

        AInterface aInterface = new Cls();
        aInterface.Compulsury();
        aInterface.Compulsury2();


        Cls cls = new Cls();
        cls.Compulsury();
        cls.Compulsury2();
    }
}
