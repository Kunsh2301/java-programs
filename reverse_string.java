import java.util.Scanner;
public class reverse_string {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a word:");
        String s=sc.next();
        StringBuilder newstr=new StringBuilder(s);
        int i=0,j=newstr.length()-1;
        while(i<j){
            char temp=newstr.charAt(i);
            newstr.setCharAt(i, newstr.charAt(j));
            newstr.setCharAt(j,temp);
            i++;
            j--;
        }
        System.out.println(newstr.toString());
        sc.close();
    }
}
