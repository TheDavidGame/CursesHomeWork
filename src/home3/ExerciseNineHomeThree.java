package home3;

import java.util.Scanner;

public class ExerciseNineHomeThree {
    public static void main(String[] args) {
        int n;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        do{
            n = input.nextInt();
            if(n < 0){
                sum++;
            }
        }while (n < 0);
        System.out.println(sum);
    }
}
