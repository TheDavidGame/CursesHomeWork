import java.util.Scanner;

public class ExerciseOneHomeTwo {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(a - b <= 0 || b - c <= 0){
            System.out.println("Петя молодец!");
        }else{
            System.out.println("Петя, пора трудиться");
        }
    }
}
