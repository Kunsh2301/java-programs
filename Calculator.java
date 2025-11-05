import java.util.Scanner;
public class Calculator{
	public static double add(double a, double b) {
        return a+b;
    }
    public static double multiply(double a, double b) {
        return a*b;
    }
    public static double divide(double a, double b) {
        return a/b;
    }
    public static double substract(double a, double b) {
        return a-b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        double a = sc.nextDouble();
        System.out.println("enter 2nd number: ");
        double b = sc.nextDouble();
        System.out.print("Choose operation:\n1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide\n");
        int choice =sc.nextInt();
        double result;
        switch(choice){
        case 1:
        	result= add(a,b);
        	break;
        case 2:
        	result= substract(a,b);
        	break;
        case 3:
        	result= multiply(a,b);
        	break;
        case 4:
        	result= divide(a,b);
        	break;
        default:
        	 System.out.println("Invalid choice!");
        	 sc.close();
        	 return;
        }
        System.out.printf("Result:%.2f ",result);
        sc.close();
    }
}