package home8;

public class Bat extends Flying implements AnimalCondition{


    @Override
    public void wayOfBirth() {
        System.out.println("Живородящие");
    }

    @Override
    public void sleep() {
        AnimalCondition.super.sleep();
    }

    @Override
    public void eat() {
        AnimalCondition.super.eat();
    }

    @Override
    void fly() {
        System.out.println("Летучая мышь летает медленно");
    }
}
