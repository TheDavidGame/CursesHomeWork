package home6;

public class Student {
    private String name;
    private String surname;
    private int[] grades = {4, 5, 4, 3, 4, 5, 5, 4, 4, 3};

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void addGrade(int grade) {
        int temp = grade;
        for (int i = 1; i < grades.length; i++) {
            grades[i - 1] = grades[i];
        }
        grades[grades.length - 1] = temp;
    }

    public double average() {
        double result = 0;
        for (int i = 0; i < grades.length; i++) {
            result += grades[i];
        }
        return result / 10;
    }
}
