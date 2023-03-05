package home8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
//        ex1
//        AnimalCondition animalCondition = new Bat();
//        animalCondition.wayOfBirth();
//        Flying flying = new Bat();
//        flying.fly();

//        ex2
//        BestCarpenterEver bestCarpenterEver = new BestCarpenterEver();
//        Chair chair = new Chair();
//        Table table = new Table();
//
//        System.out.println(bestCarpenterEver.fix(chair));
//        System.out.println(bestCarpenterEver.fix(table));

//        ex3
//        Ex3 ex3 = new Ex3(3, 5);
//        ex3.outArr();

//        ex4
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

        double[] sum = new double[n];
        for (int i = 0; i < rating.length; i++) {
            for (int j = 0; j < rating[i].length; j++) {
                sum[i] += rating[i][j];
            }
        }
        for (int i = 0; i < sum.length; i++) {
            sum[i] = Math.floor((sum[i] / 3) * 10.0) / 10.0;
        }

        ArrayList<Dog> dogs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            dogs.add(new Dog(name[0][i], name[1][i], sum[i]));
        }

        Collections.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog c1, Dog c2) {
                return Double.compare(c1.getSumRating(), c2.getSumRating());
            }
        });

        Collections.reverse(dogs);

        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).getParticipantName() + ": " + dogs.get(i).getName() + ", "  + dogs.get(i).getSumRating());
        }

    }
}

