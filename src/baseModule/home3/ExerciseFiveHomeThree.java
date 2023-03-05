package home3;

import java.util.Scanner;

public class ExerciseFiveHomeThree {
    public static void main(String[] args) {
        int m, n, out;
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        n = input.nextInt();

        out = Math.floorMod(m, n);
        System.out.println(out);
    }
}
