import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print((2 * i + 1));
            if (i != a - 1) System.out.print(", ");
        }
    }
}
