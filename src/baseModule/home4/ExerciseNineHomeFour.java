package home4;

import java.util.Objects;
import java.util.Scanner;

public class ExerciseNineHomeFour {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        String[] arr = new String[n];
        input.nextLine();
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextLine();
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i].equals(arr[j])){
                    System.out.println(arr[i]);
                    break;
                }
            }

        }
    }
}
