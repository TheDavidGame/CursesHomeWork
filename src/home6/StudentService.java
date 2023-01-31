package home6;

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

    public void sortBySurname(Student[] students) {
        String out = "";
        for (int i = students.length - 1; i > 0; i--) {
            int temp = students[i].getSurname().compareTo(students[i - 1].getSurname());
            if (temp > 0) {
                out = students[i - 1].getSurname();
            }
        }
        System.out.println(out);
    }
}
