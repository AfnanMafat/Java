public class Java_04_Loops {

    public static void main(String[] args) {

        // While
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        // Do While
        int j = 1;
        do{
            System.out.println(j);
            j++;
        }while(j <= 10);

        // For
        for(int k=1;k<=10;k++){
            System.out.println(k);
        }

        // ForEach
        int a[] = {11,12,13,14,15,6,7,8,9,10};
        for(int s : a){
            System.out.println(s);
        }
    }
}
