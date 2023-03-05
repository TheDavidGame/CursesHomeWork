package proModule.home1;

public class MyUncheckedException extends Exception{
    public MyUncheckedException() {
    }

    public MyUncheckedException(String message) {
        super(message);
    }

    public MyUncheckedException(Throwable cause) {
        super(cause);
    }
}
