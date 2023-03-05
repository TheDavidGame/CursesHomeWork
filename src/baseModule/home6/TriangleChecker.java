package home6;

public class TriangleChecker {

    private TriangleChecker() {
    }

    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
