package home4;

import java.util.Scanner;

public class ExerciseFourHomeFour {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                if (arr[i] == arr[i + 1])
                    count++;
                else {
                    System.out.println(count + " " + arr[i]);
                    count = 1;
                }
            } else {
                System.out.println(count + " " + arr[i]);
            }
        }
    }
}
