import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Read two integers
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // TODO: Print their sum using println
        int sum = a + b;
        System.out.println(sum);

        scanner.close();
    }
}
