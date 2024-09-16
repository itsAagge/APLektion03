import java.util.Arrays;
import java.util.Comparator;

public class Opgave05 {
    public static void main(String[] args) {
        char[] letters = {'W', 'R', 'G', 'W', 'W', 'R', 'G', 'R', 'W', 'W', 'R', 'G', 'W'};
        System.out.println(Arrays.toString(letters));
        order(letters);
        System.out.println(Arrays.toString(letters));
    }

    public static void order(char[] letters) {
        int g = 0;
        int r = letters.length - 1;
        int i = 0;
        while (i < r) {
            if (letters[i] == 'G') {
                swap(letters, g, i);
                g++;
            } else if (letters[i] == 'R') {
                swap(letters, r, i);
                r--;
            } else {
                i++;
            }
        }
    }


    private static void swap(char[] letters, int k, int l) {
        char e = letters[k];
        letters[k] = letters[l];
        letters[l] = e;
    }
}
