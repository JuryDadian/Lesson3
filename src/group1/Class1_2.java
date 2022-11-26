package group1;

import java.util.Scanner;

public class Class1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int month = scanner.nextInt();
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        }
            else if (month == 3 || month == 4 || month == 5) {
                    System.out.println("Весна");
            } else if (month == 6 || month == 7 || month == 8) {
                    System.out.println("Лето");
            }
            else if (month == 9 || month == 10 || month == 11) {
                System.out.println("Осень");
            }
            else {
                System.out.println("Вы ввели неверный номер месяца");
            }
        }
    }

