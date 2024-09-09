import java.util.Comparator;

public class CharComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1.equals('G')) {
            if (o2.equals('G')) {
                return 0;
            } else {
                return -1;
            }
        } else if (o1.equals('W')) {
            if (o2.equals('G')) {
                return 1;
            } else if (o2.equals('W')) {
                return 0;
            } else {
                return -1;
            }
        } else {
            if (o2.equals('R')) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
