package proModule.home1;

public class MyCheckedException extends Exception{
    public MyCheckedException(){

    }

    public MyCheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCheckedException(String message) {
        super(message);
    }
}
