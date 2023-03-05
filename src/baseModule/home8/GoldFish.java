package home8;

public class GoldFish extends Swimming implements AnimalCondition{

    @Override
    public void wayOfBirth() {
        System.out.println("Мечут икру");
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
        System.out.println("Золотая рыбка плавает медленно");
    }
}
