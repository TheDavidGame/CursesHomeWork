package home3;

import java.util.Scanner;

public class ExerciseSevenHomeThree {
    public static void main(String[] args) {
        String s;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        s = input.nextLine();

        for(int i = 0; i < s.length(); i++){
            Character sec = s.charAt(i);
            if(sec.isLetter(s.charAt(i))){
                sum++;
            }else{
                continue;
            }
        }
        System.out.println(sum);
    }
}
