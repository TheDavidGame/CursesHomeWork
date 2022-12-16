import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        final int SECONDS_PER_MINUTE = 60,MINUTES_PER_HOUR = 60, HOURS_PER_DAY = 24;;
        int count, totalMinute, totalHour, minuteOut, hoursOut;
        Scanner input = new Scanner(System.in);

        count = input.nextInt();
        totalMinute =  count / SECONDS_PER_MINUTE;
        minuteOut = totalMinute % MINUTES_PER_HOUR;
        totalHour = totalMinute / MINUTES_PER_HOUR;
        hoursOut = totalHour % HOURS_PER_DAY;
        System.out.println(hoursOut + " " + minuteOut);
    }
}
