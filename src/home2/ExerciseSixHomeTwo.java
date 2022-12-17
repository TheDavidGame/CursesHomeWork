import java.util.Scanner;

public class ExerciseSixHomeTwo {
    public static void main(String[] args) {
        int count;
        Scanner input = new Scanner(System.in);

        count = input.nextInt();
        if (count < 500) {
            System.out.println("beginner");
        } else if (count < 1500) {
            System.out.println("pre-intermediate");
        } else if (count < 2500) {
            System.out.println("intermediate");
        } else if (count < 3500) {
            System.out.println("upper-intermediate");
        } else if (count >= 3500 ) {
            System.out.println("fluent");
        }
    }
}
