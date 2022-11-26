package group1;

import java.util.Scanner;

public class Class1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите требуемый месяц в году");
        String month = scanner.nextLine();
        switch (month) {
            case "декабрь", "январь", "февраль" :
                System.out.println("Зима");
                break;
            case "март", "апрель", "май" :
                System.out.println("Весна");
                break;
            case "июнь", "июль", "август" :
                System.out.println("Лето");
                break;
            case "сентябрь", "октябрь", "ноябрь" :
                System.out.println("Осень");
                break;
        }
    }
}
