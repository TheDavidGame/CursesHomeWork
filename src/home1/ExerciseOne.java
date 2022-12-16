import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        double r, v;
        Scanner input = new Scanner(System.in);

        r = input.nextDouble();
        v = 4.0 / 3.0 * Math.PI * Math.pow(r, 3);
        System.out.println(v);
    }
}
