abstract class AbsClass{

    int a;
    AbsClass(){
        this.a = 5;
    }

    public void Greet(){
        System.out.println("Greetings!");
    }

    abstract public void MustImp();
}

class AClass extends AbsClass{
    public void MustImp(){
        System.out.println("Compulsory");
    }

    public void GreetAClass(){
        System.out.println("Greetings From A");
    }
}

public class Java_05_Abstraction {

    public static void main(String[] args) {

        AClass aClass = new AClass();
        aClass.Greet();
        aClass.GreetAClass();
        aClass.MustImp();

        // AClass obj = new AbsClass(); // Error

        AbsClass obj = new AClass();
        obj.Greet();
        obj.MustImp();
    }
}
