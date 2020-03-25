import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bh = sc.nextInt();
        int b = sc.nextInt();
        Boolean bc = false;
        int bca = 0;
        for (int i = 1; i <= b && !bc; i++) {
            int brh = sc.nextInt();
            if (bh >= brh) {
                bc = true;
                bca = i;
            }
        }

        // write your code here
    }
}