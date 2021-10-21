import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1 = Integer.parseInt(scanner.next());
        int h2 = Integer.parseInt(scanner.next());
        int h3 = Integer.parseInt(scanner.next());
        boolean ascending = h1 <= h2 && h2 <= h3;
        boolean descending = h1 >= h2 && h2 >= h3;
        boolean sportClass = ascending || descending;
        System.out.println(sportClass);
    }
}