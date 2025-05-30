import java.util.Scanner;

public class Java_02_Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Age : ");
        int age = scanner.nextInt();
        System.out.println("Age : " + age);

        System.out.println("Enter First Name : ");
        String name = scanner.next();
        System.out.println("First Name : " + name);

        System.out.println("Enter Full Name : ");
        String FullName = scanner.nextLine();
        System.out.println("Full Name : " + FullName);

        scanner.close();
    }
}
