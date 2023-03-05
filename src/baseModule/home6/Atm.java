package home6;

public class Atm {
    private int rateDollars;
    private int rateRubles;
    private static int count;

    public Atm(int rateDollars, int rateRubles) {
        this.rateDollars = rateDollars;
        this.rateRubles = rateRubles;
        count++;
    }

    public int inRubles(int dollars) {
        return dollars * rateDollars;
    }

    public int inDollars(int rubles) {
        return rubles * rateRubles;
    }

    public static int getCountOfInstances() {
        return count;
    }
}
