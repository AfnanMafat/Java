class BaseC{

    int BaseVar;

    BaseC(){
        this.BaseVar = 5;
    }

    void DisplayBase(){
        System.out.println("Base Variable Using this : " + this.BaseVar);
    }
}

class DerivedC extends BaseC{

    int DerivedVar;

    DerivedC(){
        super();
        this.DerivedVar = 7;
    }

    void DisplayDerived(){
        System.out.println("Derived Variable Using this : " + this.DerivedVar);
        System.out.println("Base Variable Using super : " + super.BaseVar);
        System.out.println("Base Variable Using this : " + this.BaseVar);
    }

}

public class Java_02_Inheritance {

    public static void main(String[] args) {

        BaseC base = new BaseC();
        System.out.println(base.BaseVar);
        base.DisplayBase();

        DerivedC d = new DerivedC();
        System.out.println("Base Variable : " + d.BaseVar);
        System.out.println("Derived Variable : " + d.DerivedVar);
        d.DisplayDerived();
        d.DisplayBase();
    }
}
