import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int countPeanut = Integer.parseInt(scanner.next());
        String isItWeekend = scanner.next();
        boolean weekend = isItWeekend.equals("true");
        boolean isNotWeekend = countPeanut >= 10 && countPeanut <= 20 && !weekend;
        boolean istWeekend = countPeanut >= 15 && countPeanut <= 25 && weekend;
        boolean result = isNotWeekend || istWeekend;
        System.out.println(result);
    }
}