import java.util.Scanner;

public class ExerciseEightHomeTwo {
    public static void main(String[] args) {
        String text, firstPart, secondPart;
        int space, numText;

        Scanner input = new Scanner(System.in);

        text = input.nextLine();
        space = text.indexOf(' ');
        String[] name = text.split(" ");
        if(name.length == 2){
            firstPart = text.substring(0, space);
            secondPart = text.substring(space + 1);
            System.out.print(firstPart + "\n" + secondPart);
        }else{
            firstPart = text.substring(0, text.indexOf(' ', space + 1));
            secondPart = text.substring(text.indexOf(' ', space + 1) + 1);
            System.out.print(firstPart + "\n" + secondPart);
        }

    }
}
