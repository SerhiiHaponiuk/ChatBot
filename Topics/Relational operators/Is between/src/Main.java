import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int firstNumber = Integer.parseInt(scanner.next());
        int secondNumber = Integer.parseInt(scanner.next());
        int thirdNumber = Integer.parseInt(scanner.next());
        boolean secondFirstThird = firstNumber >= secondNumber && firstNumber <= thirdNumber;
        boolean thirdFirstSecond = firstNumber <= secondNumber && firstNumber >= thirdNumber;
        boolean result = secondFirstThird || thirdFirstSecond;
        System.out.println(result);
    }
}
