package home8;

public class Ex3 {
    private int n, m;
    private int[][] arr;

    public Ex3(int n, int m) {
        this.n = n;
        this.m = m;
        arr = new int[m][n];
    }

    public void outArr() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
