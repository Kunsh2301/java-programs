import java.util.Scanner;

public class gcd {
    public static int gcd1(int a, int b) {
        int result = (a < b) ? a : b;
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd1(a, b));
        sc.close();
    }
}
