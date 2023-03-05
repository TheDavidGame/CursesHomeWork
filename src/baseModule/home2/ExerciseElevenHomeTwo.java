import java.util.Scanner;

public class ExerciseElevenHomeTwo {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if((a + b) > c && (a + c) > b && (b + c) > a){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
