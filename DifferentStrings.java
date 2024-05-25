import java.util.HashSet;
import java.util.Scanner;

public class DifferentStrings {
    String solve(String s){
        HashSet<Character> hs = new HashSet<>();

        for(char c : s.toCharArray())
            hs.add(c);

        if(hs.size() == 1)
            return "NO";

        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length-1; i++){
            char c = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = c;
        }
        String ans = new String(arr);
        return "YES\n" + ans;
    }

    public static void main(String[] args) {
        DifferentStrings ds = new DifferentStrings();

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t-- > 0){
            String s = scanner.next();

            System.out.println(ds.solve(s));
        }
    }
}
