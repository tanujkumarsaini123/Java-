class MyException extends Exception {
    String msg;
    
    MyException(String s) {   
        msg = s;
    }
    
    void printMsg() {        
        System.out.println(msg);
    }
}

public class DemoString {
    public static void main(String[] args) {
        try {
            throw new MyException("Custom Exception Occurred!");
        }
        catch (MyException e) {
            e.printMsg();
        }
    }
}
