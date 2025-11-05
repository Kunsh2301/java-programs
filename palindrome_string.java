import java.util.Scanner;
public class palindrome_string {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder s=new StringBuilder(input);
        int i=0,j=s.length()-1;
        while(i<j){
            char x=s.charAt(i);
            char y=s.charAt(j);
            if(x!=y){
                System.out.println("false");
                sc.close();
                return;
            }
            i++;
            j--;
        }
        System.out.println("true");
        sc.close();
    }
}
