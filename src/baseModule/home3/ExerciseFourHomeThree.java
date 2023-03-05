package home3;

import java.util.LinkedList;
import java.util.Scanner;

public class ExerciseFourHomeThree {
    public static void main(String[] args) {
        int n = 0;
        LinkedList<Integer> stack = new LinkedList<Integer>();

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        while(n > 0){
            stack.push( n % 10 );
            n /= 10;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
