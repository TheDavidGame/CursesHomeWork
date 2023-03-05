package home4;

import java.util.Scanner;

public class ExerciseTenHomeFour {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame(){
        int inputNumber = 0;
        Scanner input = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 1000);

        do {
             inputNumber = input.nextInt();
             if(inputNumber < randomNumber){
                 System.out.println("Это число меньше загаданного.");
             }else if(inputNumber > randomNumber){
                 System.out.println("Это число больше загадонного.");
             }else{
                 System.out.println("Победа!");
             }
        }while (inputNumber > 0);
    }
}
