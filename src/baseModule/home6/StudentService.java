package home6;


import java.util.ArrayList;
import java.util.Arrays;

public class StudentService {
    public Student bestStudent(Student[] students) {
        double max = 1.0;
        int numberStudent = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i].average() > max) {
                max = students[i].average();
            }
        }

        for (int i = 0; i < students.length; i++) {
            if (students[i].average() == max) {
                numberStudent = i;
            }
        }
        return students[numberStudent];
    }


    public void sortStud(ArrayList<Student> list) {
        list.sort((o1, o2)
                -> o1.getSurname().compareTo(
                o2.getSurname()));

        for (int i = 0;i < list.size(); i++){
            System.out.println(list.get(i).getSurname());
        }

    }
}
