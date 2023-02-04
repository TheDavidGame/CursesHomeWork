package home6;

public class AmazingString {
    private char[] arr;

    public AmazingString(char[] arr) {
        this.arr = arr;
    }

    public AmazingString(String arr) {
        this.arr = arr.toCharArray();
    }

    public void setArr(char[] arr) {
        this.arr = arr;
    }

    public char getIndex(int index) {
        return arr[index];
    }

    public int getLength() {
        return arr.length;
    }

    public void stringOut() {
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }

    public boolean substring(char[] arr) {
        for (int i = 0; i < this.arr.length - arr.length + 1; i++) {
            int j = 0;
            while (j < arr.length && this.arr[i + j] == arr[j]) {
                j++;
            }
            if (j == arr.length) {
                return true;
            }
        }
        return false;
    }

    public boolean substring(String str) {
        char[] arr = new char[str.length()];
        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }

        for (int i = 0; i < this.arr.length - arr.length + 1; i++) {
            int j = 0;
            while (j < arr.length && this.arr[i + j] == arr[j]) {
                j++;
            }
            if (j == arr.length) {
                return true;
            }
        }
        return false;
    }

    public void deleteSpace() {
        if (arr[0] == ' ') {
            char[] out = new char[arr.length - 1];

            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1) {
                    out[out.length - 1] = arr[arr.length - 1];
                } else {
                    out[i] = arr[i + 1];
                }

            }
            setArr(out);
        }
    }

    public void reverseArr() {
        for (int i = 0; i < (arr.length / 2); i++) {
            char sec = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = sec;
        }
    }
}
