import java.util.Scanner;

public class ExerciseTenHomeTwo {
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);

        x = input.nextDouble();
        if(Math.log(Math.pow(Math.E, x)) == x){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
