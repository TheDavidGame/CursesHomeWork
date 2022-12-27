package home3;

import java.util.Scanner;

public class ExerciseThreeHomeThree {
    public static void main(String[] args) {
        int m, n;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        n = input.nextInt();

        for(int i = 1;i <= n; i++){
            sum += Math.pow(m, i);
        }
        System.out.println(sum);
    }
}
