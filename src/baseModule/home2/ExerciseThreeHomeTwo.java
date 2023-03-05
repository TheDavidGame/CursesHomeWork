import java.util.Scanner;

public class ExerciseThreeHomeTwo {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        if(x > 12){
            System.out.println("Пора");
        }else{
            System.out.println("Рано");
        }

    }
}
