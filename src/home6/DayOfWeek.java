package home6;

public class DayOfWeek {
    private byte numberOfDay;
    private String nameOfDay;

    public DayOfWeek(byte numberOfDay, String nameOfDay) {
        this.numberOfDay = numberOfDay;
        this.nameOfDay = nameOfDay;
    }

    public byte getNumberOfDay() {
        return numberOfDay;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }
}
