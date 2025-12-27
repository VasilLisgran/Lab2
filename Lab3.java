import java.util.Scanner;

public class Lab3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int H = scanner.nextInt();
        int alpha = scanner.nextInt();
        int L = scanner.nextInt();
        int T0 = scanner.nextInt();

        int T = T0;
        int count = 0;
        int m = 0;
        do{
            if(T < H) {
                System.out.println(count + ", " + T);
                m++;
                break;
            }
            T = T + L;
            T = T - (T*alpha)/100;
            count++;
        }
        while (count < 1000000000);

        if(m == 0) System.out.println("NO");

    }
}
