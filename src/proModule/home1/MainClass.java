package proModule.home1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws MyCheckedException {
//        ex1
//        readFile();
//        ex2
//        MyEvenNumber myEvenNumber = new MyEvenNumber(2);
//        ex3
//        находится в файле ex3.txt
//        ex4
//        FormValidator.checkName("Анна");
//        FormValidator.checkBirthdate("01.01.1905");
//        FormValidator.checkGender("Males");
//        FormValidator.checkHeight("-5");
    }

    public static void readFile() {
        final String PKG_DIRECTORY = "C:\\Users\\User\\IdeaProjects\\JavaCurseFolder\\CursesHomeWork\\src\\proModule\\home1";
        final String OUTPUT_FILE_NAME = "output.txt";
        final String INPUT_FILE_NAME = "input.txt";
        ArrayList<String> lines = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(INPUT_FILE_NAME))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        try (Writer wr = new FileWriter(PKG_DIRECTORY + "/" + OUTPUT_FILE_NAME)) {
            for (String line : lines) {
                wr.write(line.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
