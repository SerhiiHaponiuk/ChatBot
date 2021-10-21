import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String expression = string.toLowerCase();
        boolean stringCheck = expression.startsWith("j");
        System.out.println(stringCheck);
    }
}