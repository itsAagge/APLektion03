import java.util.Arrays;
import java.util.Comparator;

public class Opgave05 {
    public static void main(String[] args) {
        char[] letters = {'W', 'R', 'G', 'W', 'W', 'R', 'G', 'R', 'W', 'W', 'R', 'G', 'W'};
        order(letters);
        System.out.println(Arrays.toString(letters));
    }

    public static void order(char[] letters) {
        quickSort(letters, 0, letters.length - 1, new CharComparator());
    }

    public static void quickSort(char[] letters, int low, int high, Comparator comparator) {
        if (low < high) {
            int middle = partition(letters, low, high, comparator);
            quickSort(letters, low, middle - 1, comparator);
            quickSort(letters, middle + 1, high, comparator);
        }
    }

    private static int partition(char[] letters, int low, int high, Comparator comparator) {
        char e = letters[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {
            if (comparator.compare(letters[i], e) <= 0) {
                i++;
            } else if (comparator.compare(letters[j], e) > 0) {
                j--;
            } else {
                swap(letters, i, j);
                i++;
                j--;
            }
        }
        swap(letters, low, j);
        return j;
    }

    private static void swap(char[] letters, int k, int l) {
        char e = letters[k];
        letters[k] = letters[l];
        letters[l] = e;
    }
}
