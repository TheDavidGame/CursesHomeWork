import java.util.Scanner;

public class ExerciseFiveHomeTwo {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(Math.pow(b, 2) - 4 * a * c > 0){
            System.out.println("Решение есть");
        }else{
            System.out.println("Решения нет");
        }

    }
}
