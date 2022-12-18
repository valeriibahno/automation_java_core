package homeWork6.task3;

public class MyException extends Exception{

    public MyException() {
        super();
        System.out.println("MyException 1");
    }

    public MyException(String s) {
        super(s);
        System.out.println("MyException 2");
    }
}
