package home6;

public class Cat {

    private void sleep() {
        System.out.println("Sleep");
    }

    private void meow() {
        System.out.println("Meow");
    }

    private void eat() {
        System.out.println("Eat");
    }

    public void status() {
        int result = 1 + (int) (Math.random() * 3);
        switch (result) {
            case 1:
                sleep();
                break;
            case 2:
                meow();
                break;
            case 3:
                eat();
                break;
        }
    }
}
