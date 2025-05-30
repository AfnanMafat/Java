public class Java_03_Conditional_Statement {

    public static void main(String[] args) {

        int age = 15;

        if(age < 18){
            System.out.println("You Cant Vote");
        }else{
            System.out.println("You Can Vote");
        }

        int Salary = 125000;

        if(Salary <  10000){
            System.out.println("Less Earn");
        }else if(Salary >= 10000 && Salary <= 50000){
            System.out.println("Good Earn");
        }else{
            System.out.println("Great Earn");
        }
    }
}
