import java.util.Scanner;

public class Factor {
    public static void Factorofnumber(int a) {
        for(int i=1;i<=a;i++){
            if(a%i==0) System.out.print(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Factors are:");
        Factorofnumber(a);
        sc.close();
    }
}