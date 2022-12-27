package home3;

import java.util.Scanner;

public class ExerciseEightHomeThree {
    public static void main(String[] args) {
        int n, p, a;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        p = input.nextInt();

        for(int i = 0;i < n; i++){
            a = input.nextInt();
            if(a > p){
                sum+= a;
            }
        }
        System.out.println(sum);
    }
}
