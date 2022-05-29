import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number a:");
        int a = scanner.nextInt();
        System.out.println("Please enter number b:");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a == b) {
            System.out.println("a is equal to b");

        } else {
            System.out.println("a is smaller than b");
        }

    }
    private static void printMessage(String message){
        System.out.println(message);
    }
    55
}


