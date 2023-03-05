import java.util.Scanner;

public class ExerciseTwoHomeTwo {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        y = input.nextInt();
        if(x > 0 && y > 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
