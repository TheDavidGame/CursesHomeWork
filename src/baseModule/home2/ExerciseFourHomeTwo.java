import java.util.Scanner;

public class ExerciseFourHomeTwo {
    public static void main(String[] args) {
        int a;
        int timer = 0;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        if(a > 5){
            System.out.println("Ура, выходные!");
        }else{
            timer = 6 - a;
            System.out.println(timer);
        }

    }
}
