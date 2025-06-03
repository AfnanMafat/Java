public class java_08_ExceptionHandling {

    public static void Exit(){
        System.exit(0);
    }

    public static void Exc(int b){
        if(b == 0){
            throw new RuntimeException("Not Allowed");
        }
    }

    public static void main(String[] args) throws Exception{

        int a = 5;

        // Exc(0);

        try{
            int b = a / (a - 5);
        } catch (Exception e) {
            // throw  new Exception("Ye nahi Ho Sakta");
            System.out.println(e);
        } finally {
            Exit();
            System.exit(0); // 1 Way
            System.out.println("Always Execute");
        }
    }
}
