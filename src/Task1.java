import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число (a):");
        int a = scanner.nextInt();

        System.out.println("Введите число (b):");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        double division = (double) a / b;

        System.out.println("Сумма a и b: " + sum);
        System.out.println("Разность a и b: " + difference);
        System.out.println("Произведеие a и b: " + product);
        System.out.println("Частное a и b: " + division);
    }
}