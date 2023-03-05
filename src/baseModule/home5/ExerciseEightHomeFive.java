package home5;

import java.util.Scanner;

public class ExerciseEightHomeFive {
    public static void main(String[] args) {
        int n, sumN = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println(sum(n, sumN));
    }

    public static int sum(int n, int sumN) {
        if (n == 0)
            return sumN;
        return sum(n / 10, sumN + n % 10);

    }

}
