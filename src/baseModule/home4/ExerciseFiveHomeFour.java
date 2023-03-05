package home4;

import java.util.Scanner;

public class ExerciseFiveHomeFour {
    public static void main(String[] args) {
        int n, m;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        m = input.nextInt();

        for(int i = 0;i < m; i++){
            int sec = arr[arr.length - 1];

            for(int j = arr.length - 1;j > 0;j--){
                arr[j] = arr[j - 1];
            }

            arr[0] = sec;
        }

        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
