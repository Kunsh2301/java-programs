import java.util.Scanner;
public class palindrome_array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n=sc.nextInt();
        System.out.println("enter the elements:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                System.out.println("false");
                sc.close();
                return ;
            }
            i++;
            j--;
        }
        System.out.println("true");
        sc.close();
    }
}
