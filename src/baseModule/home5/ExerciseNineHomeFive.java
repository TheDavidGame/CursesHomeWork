package home5;

import java.util.Scanner;

public class ExerciseNineHomeFive {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        numbers(n);
    }

    public static void numbers(int n) {
        if (n < 10) {
            System.out.print(n + " ");
        } else {
            numbers(n / 10);
            System.out.print(n % 10 + " ");
        }
    }
}
