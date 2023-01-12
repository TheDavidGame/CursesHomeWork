package home4;

import java.util.Scanner;

public class ExerciseOneHomeFour {
    public static void main(String[] args) {
        int n;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextDouble();
        }
        for (double e : arr) {
            sum += e;
        }
        System.out.println(sum / n);
    }
}
