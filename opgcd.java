import java.util.Scanner;

public class opgcd {
    public static int gcd(int a, int b) {
        if(a==0) return b;
        if(b==0) return a;
        return a>b?gcd(a%b,b):gcd(a,b%a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
        sc.close();
    }
}
