package home3;

import java.util.Scanner;

public class ExerciseTenHomeThree {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int k = i; k >= 1; k--)
                System.out.print((k >= 10) ? +k : "#");

            for (int k = 2; k <= i; k++)
                System.out.print((k >= 10) ? +k : "#");
            System.out.println();
            if (i - n == 0) {
                for (int k = 1; k <= n; k++)
                    System.out.print((k == n) ? "|" : " ");
            }

        }

    }
}
