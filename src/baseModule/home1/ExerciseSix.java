import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        double miles;
        int km;
        Scanner input = new Scanner(System.in);

        km = input.nextInt();
        miles = km / 1.60934;
        System.out.println(miles);
    }
}
