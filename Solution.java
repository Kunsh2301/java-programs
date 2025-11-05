import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        List<String> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(sc.next());
        }
        String remove=sc.next();
        students.removeAll(Collections.singleton(remove));
        if(students.isEmpty()){
            System.out.println("cart is empty");
        }
        else{
            for(String x:students){
                System.out.println(x);
            }
        }
        sc.close();
    }
}

