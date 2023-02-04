package home6;

public class TimeUnit {
    private int second;
    private int minute;
    private int hours;

    public TimeUnit(int hours, int minute, int second) {
        if (hours <= 24 && minute < 60 && second < 60) {
            this.hours = hours;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Error");
            throw new UnsupportedOperationException("Не правильный формат");
        }

    }

    public TimeUnit(int hours, int minute) {
        if (hours <= 24 && minute < 60) {
            this.hours = hours;
            this.minute = minute;
            this.second = 0;
        } else {
            System.out.println("Error");
            throw new UnsupportedOperationException("Не правильный формат");
        }

    }

    public TimeUnit(int hours) {
        if (hours <= 24) {
            this.hours = hours;
            this.minute = 0;
            this.second = 0;
        } else {
            System.out.println("Error");
            throw new UnsupportedOperationException("Не правильный формат");
        }

    }

    public void timeNow() {
        System.out.println(hours + ":" + minute + ":" + second);
    }

    public void timeNowForm() {
        if (hours > 12) {
            int secHours = hours - 12;
            System.out.println(secHours + ":" + minute + ":" + second + " pm");
        } else {
            System.out.println(hours + ":" + minute + ":" + second + " am");
        }
    }

    public void addTime(int hours, int minute, int second) {
        if (hours <= 24 && minute < 60 && second < 60) {
            this.hours += hours;
            this.minute += minute;
            this.second += second;
            if(this.second > 60){
                this.second %= 60;
                this.minute++;
            }
            if(this.minute > 60){
                this.minute %= 60;
                this.hours++;
            }
        } else {
            System.out.println("Error");
            throw new UnsupportedOperationException("Не правильный формат");
        }
    }
}
