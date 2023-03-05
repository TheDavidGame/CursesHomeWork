package home3;

import java.util.Scanner;

public class ExerciseSixHomeThree {
    public static void main(String[] args) {
        int n, first = 8, second = 4, third = 2, fourth = 1, out1 = 0, out2 = 0,
                out3 = 0, out4 = 0;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        while (n != 0) {
            if (n - first >= 0) {
                n -= first;
                out1++;
            } else if (n - second >= 0) {
                n -= second;
                out2++;
            } else if (n - third >= 0) {
                n -= third;
                out3++;
            } else if (n - fourth >= 0) {
                n -= fourth;
                out4++;
            }
        }
        System.out.println(out1 + " " + out2 + " " + out3 + " " + out4);

    }
}
