import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n1);
        for (int i = n1 + 1; i <= n2; i++) {
            if ((i % 3) == 0) {
                System.out.println("Fizz");
            } else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } else if ((i % 3) == 0 && (i % 5) == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
        // put your code here
    }
}