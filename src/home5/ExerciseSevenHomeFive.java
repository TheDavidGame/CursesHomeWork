package home5;

import java.util.Scanner;

public class ExerciseSevenHomeFive {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        String[][] name = new String[2][n];
        input.nextLine();
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
                name[i][j] = input.nextLine();
            }
        }

        double[][] rating = new double[n][3];
        for (int i = 0; i < rating.length; i++) {
            for (int j = 0; j < rating[i].length; j++) {
                rating[i][j] = input.nextInt();
            }
        }

        double[] sum = new double[4];
        for (int i = 0; i < rating.length; i++) {
            for (int j = 0; j < rating[i].length; j++) {
                sum[i] += rating[i][j];
            }
        }

        for (int i = 0; i < sum.length; i++) {
            sum[i] = Math.floor((sum[i] / 3) * 10.0) / 10.0;
        }

        for (int i = 0; i < sum.length - 1; i++) {
            for(int j = 0; j < sum.length - i - 1; j++) {
                if(sum[j + 1] > sum[j]) {
                    double swap = sum[j];
                    sum[j] = sum[j + 1];
                    sum[j + 1] = swap;
                    String temp = name[0][j];
                    name[0][j] = name[0][j + 1];
                    name[0][j + 1] = temp;
                    String temp1 = name[1][j];
                    name[1][j] = name[1][j + 1];
                    name[1][j + 1] = temp1;
                }
            }
        }
        for (int i = 0; i < sum.length; i++) {
            if(i <= 2){
                System.out.println(name[0][i] + ": " + name[1][i] + ", " + sum[i]);
            }
        }
    }
}
