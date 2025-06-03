class Parent{

    void ParentM(){
        System.out.println("Parent Method");
    }

    void Greet(){
        System.out.println("Greet From Parent");
    }
}

class Child extends Parent{
    void ChildM(){
        System.out.println("Child Method");
    }

    void Greet(){
        System.out.println("Greet From Child");
    }
}
public class Java_04_RunTimePolymorphism {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.ParentM();
        parent.Greet();

        System.out.println();

        Child child = new Child();
        child.ChildM();
        child.Greet();

        System.out.println();

        Parent parent1 = new Child();
        parent1.Greet();
        parent1.ParentM();
    }
}
