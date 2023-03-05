package home4;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseSevenHomeFour {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] arr = new int[n];
        int[] out = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            out[i] = arr[i] * arr[i];
        }
        Arrays.sort(out);
        for (int i = 0; i < out.length; i++){
            System.out.print(out[i] + " ");
        }
    }
}

