import java.util.Scanner;

public class oplcm {
    public static int gcd(int a, int b) {
        if(a == 0) return b;
        if(b == 0) return a;
        return a > b ? gcd(a % b, b) : gcd(a, b % a);
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lcm(a, b));
        sc.close();
    }
}
