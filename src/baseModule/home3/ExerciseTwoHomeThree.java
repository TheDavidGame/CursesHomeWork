package home3;

import java.util.Scanner;

public class ExerciseTwoHomeThree {
    public static void main(String[] args) {
        int m, n;

        Scanner input = new Scanner(System.in);

        m = input.nextInt();
        n = input.nextInt();

        System.out.println((m + n) * (n - m + 1) / 2);
    }
}
