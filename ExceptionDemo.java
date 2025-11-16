public class ExceptionDemo {

    public static void main(String[] args) {
        try {
        
            throw new Exception("This is a custom exception message!");
        }
        catch (Exception e) {
            
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Tanuj kumar 24csu347");
            System.out.println("Finally block executed!");
        }
    }
}
