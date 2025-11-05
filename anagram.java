import java.util.Scanner;
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        if(name1.length()!=name2.length()){
            System.out.println("false");
            sc.close();
            return;
        }
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<name1.length();i++){
            char x= name1.charAt(i);
            freq1[x-'a']++;
            char y=name2.charAt(i);
            freq2[y-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                System.out.println("false");
                sc.close();
                return;
            }
        }
        System.out.println("true");
        sc.close();
    }
}
