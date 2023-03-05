import java.util.Scanner;

public class ExerciseSevenHomeTwo {
    public static void main(String[] args) {
        String text, firstPart, secondPart;
        int space;

        Scanner input = new Scanner(System.in);

        text = input.nextLine();
        space = text.indexOf(' ');
        firstPart = text.substring(0, space);
        secondPart = text.substring(space + 1);
        System.out.print(firstPart + "\n" + secondPart);
    }
}
