import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n<10 && n>0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        // put your code here
    }
}