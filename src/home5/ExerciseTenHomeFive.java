package home5;

import java.util.Scanner;

public class ExerciseTenHomeFive {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        numbers(n);
    }

    public static int numbers(int n){
        if(n == 0){
            return n;
        }
        System.out.print(n % 10 + " ");
        return numbers(n / 10);
    }
}
