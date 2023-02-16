package home8;

public class Eagle extends Flying implements AnimalCondition{

    @Override
    public void wayOfBirth() {
        System.out.println("Откладывает яйца");
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
            System.out.println("Орел летает быстро");
    }
}
