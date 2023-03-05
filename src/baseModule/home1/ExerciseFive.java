import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        int cm;
        double inch;
        Scanner input = new Scanner(System.in);

        cm = input.nextInt();
        inch = cm * 2.54;
        System.out.println(inch);
    }
}
