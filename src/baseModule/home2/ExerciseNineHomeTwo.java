import java.util.Scanner;

public class ExerciseNineHomeTwo {
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);

        x = input.nextDouble();
        if((int)(Math.pow(Math.sin(x),2) + Math.pow(Math.cos(x),2)) - 1 == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
