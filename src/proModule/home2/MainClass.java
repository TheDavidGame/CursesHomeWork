package proModule.home2;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
//        ex1
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//
//        ex1<Integer> ex1 = new ex1<>();
//        HashSet<Integer> out = ex1.getUniqueElements(list);
//        System.out.println(out);

//        ex2
//        Scanner input = new Scanner(System.in);
//        String x = input.nextLine();
//        String y = input.nextLine();
//
//        ex2 ex2 = new ex2();
//        System.out.println(ex2.Anagram(x, y));

//        ex3
//        PowerfulSet powerfulSet = new PowerfulSet();
//        Set<Integer> set1 = new HashSet<>();
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//
//        Set<Integer> set2 = new HashSet<>();
//        set2.add(0);
//        set2.add(1);
//        set2.add(2);
//        set2.add(4);
//
//        System.out.println(powerfulSet.intersection(set1, set2));
//
//        System.out.println(powerfulSet.union(set1, set2));
//
//        System.out.println(powerfulSet.relativeComplement(set1, set2));

//        ex4
        ArrayList<Document> documents = new ArrayList<>();
        documents.add(new Document(1, "Adress", 2));
        documents.add(new Document(2, "Last names", 5));
        documents.add(new Document(3, "First names", 5));
        documents.add(new Document(4, "Dates", 3));

        Map<Integer, Document> documentMap = organizeDocuments(documents);

    }

    public static Map<Integer, Document> organizeDocuments(List<Document> documents) {
        Map<Integer, Document> map = new HashMap<>();
        for (Document document : documents) {
            map.put(document.id, document);
        }
        return map;
    }
}


