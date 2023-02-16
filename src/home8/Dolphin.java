package home8;

public class Dolphin extends Swimming implements AnimalCondition{

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
    void swim() {
        System.out.println("Делфин плавает быстро");
    }
}
