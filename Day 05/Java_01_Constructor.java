class Base{

    int a;

    Base(){
        this.a = 5;
    }

    Base(int a){
        this.a = a;
    }

    Base(Base b){
        this.a = b.a;
    }

    void DisplayA(){
        System.out.println(this.a);
    }

}

public class Java_01_Constructor {

    public static void main(String[] args) {

        Base b = new Base(17);
        b.DisplayA();

        Base newB = new Base(b);
        newB.DisplayA();

    }
}
