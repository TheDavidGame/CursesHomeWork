import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        int n, firstPart, secondPart;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();
        firstPart = n % 10;
        secondPart = n / 10;
        if( n != 0){
            System.out.println(firstPart + "" + secondPart);
        }else{
            System.out.println(n);
        }

    }
}
