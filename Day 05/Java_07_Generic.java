class GClass<T>{

    void Add(T a,T b){
        System.out.println(a);
        System.out.println(b);
    }
}

public class Java_07_Generic {

    public static void main(String[] args) {

        GClass<Integer> gClass = new GClass<>();
        gClass.Add(5,7);

    }
}
