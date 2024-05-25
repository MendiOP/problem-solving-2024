import java.util.HashMap;
import java.util.Scanner;

public class SymmetricEncoding {
    String solve(String s){
        int[] arr = new int[26];
        for(char c : s.toCharArray())
            arr[c-'a']++;

        String r = "";
        for(int i=0; i<arr.length; i++)
            if(arr[i] != 0)
                r += (char)('a'+i);

        String ans="";
        for(char c : s.toCharArray()){
            int j = r.indexOf(c);

            ans += r.charAt(r.length() - 1 - j);
        }

        return ans;
    }

    public static void main(String[] args) {
        SymmetricEncoding sm = new SymmetricEncoding();

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0){
            int n = scanner.nextInt();
            String s = scanner.next();

            System.out.println(sm.solve(s));
        }
    }
}
