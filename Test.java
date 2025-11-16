class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

class A {
    void display() throws Ex1 {  
        throw new Ex1();
    }
}

class B extends A {
    void display() throws Ex2 {
        throw new Ex2();
    }
}

class C extends B {
    void display() throws Ex3 { 
        throw new Ex3();
    }
}

public class Test {
    public static void main(String[] args) {
        A obj = new C(); 

        try {
            obj.display();
        }
        catch (Ex3 e) {
            System.out.println("Caught Exception from Class C");
        }
        catch (Ex2 e) {
            System.out.println("Caught Exception from Class B");
        }
        catch (Ex1 e) {
            System.out.println("Caught Exception from Class A");
        }
    }
}
