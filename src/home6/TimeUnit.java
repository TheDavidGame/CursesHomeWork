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
            switch (hours) {
                case 13:
                    hours = 1;
                    break;
                case 14:
                    hours = 2;
                    break;
                case 15:
                    hours = 3;
                    break;
                case 16:
                    hours = 4;
                    break;
                case 17:
                    hours = 5;
                    break;
                case 18:
                    hours = 6;
                    break;
                case 19:
                    hours = 7;
                    break;
                case 20:
                    hours = 8;
                    break;
                case 21:
                    hours = 9;
                    break;
                case 22:
                    hours = 10;
                    break;
                case 23:
                    hours = 11;
                    break;
                case 24:
                    hours = 12;
                    break;
            }
            System.out.println(hours + ":" + minute + ":" + second + " pm");
        } else {
            System.out.println(hours + ":" + minute + ":" + second + " am");
        }
    }

    public void addTime(int hours, int minute, int second) {
        if (hours <= 24 && minute < 60 && second < 60) {
            this.hours += hours;
            this.minute += minute;
            this.second += second;
        } else {
            System.out.println("Error");
            throw new UnsupportedOperationException("Не правильный формат");
        }
    }
}
