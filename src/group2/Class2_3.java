package group2;

import java.util.Scanner;

public class Class2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int sum = 0;
            if (number > 0) {
                for (int i = 1; i <= number; i++) {
                    sum = sum + i;
                }
                System.out.println(sum);
            }
        }
        System.out.println("Вы не верно выполнили условие");
    }
}
