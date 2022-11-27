package group3;

import java.util.Scanner;

public class Class3_2_Bank {
    public static void main(String[] args) {
        float percent;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        float deposit = scanner.nextFloat();
        System.out.println("Введите количество месяцев");
        int months = scanner.nextInt();
            for (int i = 0; i < months; i++) {
                percent = (float) ((deposit * 0.07 * 30) / 365);
                deposit = deposit + percent;
            }
        System.out.println(deposit);
    }
}
