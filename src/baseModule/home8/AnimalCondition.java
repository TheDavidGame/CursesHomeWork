package home8;

public interface AnimalCondition {

    void wayOfBirth();

    default void sleep(){
        System.out.println("Sleep");
    }

    default void eat(){
        System.out.println("Eat");
    }

}
