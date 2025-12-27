import java.util.Arrays;
import java.util.Scanner;

public class Lab4 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        double[] raznosti = new double[n];

        double sum = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                if(j!=i) sum+=numbers[j];
            }
            double average = sum / (n-1);
            raznosti[i] = Math.abs(numbers[i] - average);
        }

        int closestInd = 0;
        double start = raznosti[0];
        for (int i = 1; i < n; i++) {
            if(raznosti[i] < start) {
                start = raznosti[i];
                closestInd = i;
            }
        }

        System.out.println(numbers[closestInd] + ", " + (closestInd+1));
    }
}
