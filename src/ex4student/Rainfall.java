package ex4student;

public class Rainfall {
    private final int[] weeklyRainfall = {
            20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13, 15, 10,
            9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2,
            0, 0, 18, 0, 0, 0, 34, 12, 34, 23, 23, 12, 44,
            23, 12, 34, 22, 22, 22, 22, 18, 19, 21, 32, 24, 13};

    /**
     * Return the week number of the first week
     * in the period of 3 weeks with the least rainfall.
     */
    public int minRainfall3() {
        int index = 0;
        int sum = 0;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < weeklyRainfall.length - 2; i++) {
            sum = weeklyRainfall[i] + weeklyRainfall [i+1] + weeklyRainfall [i+2];
            if (sum < minSum) {
                minSum = sum;
                index = i;
            }
        }

        return index + 1;
    }

    /**
     * Return the week number of the first week
     * in the period of n weeks with the least rainfall.
     */
    public int minRainfallN(int n) {
        int index = 0;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < weeklyRainfall.length - n; i++) {
            int sum = 0;
            for (int j = i; j < n + i; j++) {
                sum += weeklyRainfall[j];
            }
            if (sum < minSum) {
                minSum = sum;
                index = i;
            }
        }

        return index + 1;
    }

    /**
     *  Return the week number of the first week in the longest period,
     *  where the rainfall has been exactly the same each week.
     */
    public int sameRainfall() {
        // TODO
        return 0;
    }
}
