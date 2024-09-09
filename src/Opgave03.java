import java.util.Arrays;

public class Opgave03 {
    public static void main(String[] args) {
        int[] tal = {5, 10, 5, 6, 4, 9, 8};
        System.out.println(Arrays.toString(prefixAverage(tal)));
        System.out.println(Arrays.toString(prefixAverageFast(tal)));
    }

    public static double[] prefixAverage(int[] input) {
        double[] result = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            double sum = 0.0;
            for (int j = i; j >= 0; j--) {
                sum += input[j];
            }
            sum /= i+1;
            result[i] = sum;
        }
        return result;
    }

    public static double[] prefixAverageFast(int[] input) {
        double[] result = new double[input.length];
        double sum = 0.0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
            result[i] = sum/(i+1);
        }
        return result;
    }
}
