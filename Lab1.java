import java.util.Scanner;

public class Lab1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int a0 = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 0; i < n-1; i++) {
            System.out.print(sumOfDigits(a0) + ", ");
            a0 = sumOfDigits(a0);
        }
        System.out.println(sumOfDigits(a0));
    }
    public static int sumOfDigits(int a){
        a = Math.abs(a);
        int sum = 0;
        do {
            sum += (a %10)*5;
            a = a / 10;
        }
        while(a>0);
        return sum;
    }
}
