import java.util.Scanner;

public class phoneDesktop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while(t-- > 0){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int w = (y + 1) / 2;
            System.out.println(Math.max(w, (x + 4 * y + 14) / 15));
        }
    }
}
