import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        List<String> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            students.add(sc.nextLine());
        }
        Set<String> uniqueSet = new HashSet<>(students);
        List<String> uniqueList = new ArrayList<>(uniqueSet);
        Collections.sort(uniqueList);
        for (String name : uniqueList) {
            System.out.println(name);
        }
        sc.close();
    }
}

