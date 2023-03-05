package home4;

import java.util.*;

public class ExerciseSixHomeFour {
    public static void main(String[] args) {
        String text;
        Scanner input = new Scanner(System.in);
        text = input.nextLine();
        toMorze(text);
    }

    public static void toMorze(String S) {
        String[] arrMorze = {".-", "-...", ".--", "--.", "-..",
                ".", "...-", "--..", "..", ".---",
                "-.-", ".-..", "--", "-.", "---",
                ".--.", ".-.", "...", "-", "..-", "..-.",
                "....", "-.-.", "---.", "----", "--.-",
                "--.--", "-.--", "-..-", "..-..",
                "..--", ".-.-"};
        String[] arrRu = {"А", "Б", "В", "Г", "Д", "Е", "Ж", "З", "И", "Й", "К",
                "Л", "М", "Н", "О", "П", "Р", "С",
                "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш",
                "Щ", "Э", "Ю", "Я"};

        String[] in = S.split("");
        List<String> out = new ArrayList<String>();

        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < arrRu.length; j++) {
                if (Objects.equals(in[i], arrRu[j])) {
                    out.add(arrMorze[j]);
                }
            }
        }

        System.out.print(String.join(" ", out));
    }
}
