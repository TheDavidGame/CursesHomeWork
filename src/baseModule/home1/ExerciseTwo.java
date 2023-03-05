import java.util.Scanner;

//s = √[(a^2 + b^2)/2].
public class ExerciseTwo {
    public static void main(String[] args) {
        int a, b;
        double s;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        s = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2);
        System.out.println(s);
    }
}
