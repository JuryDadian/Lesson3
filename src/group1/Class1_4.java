package group1;

import java.util.Scanner;

public class Class1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение t");
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t <= -5 && t > -20) {
            System.out.println("Нормально");
        } else if (t <= -20) {
            System.out.println("Холодно");
        }
    }
}
