package kykyxa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        day_3 Day_3 = new day_3();
//        String a;
//        while (true) {
//            System.out.print("Введите название города: ");
//            a = scanner.nextLine();
//
//            if (a.equals("Stop")) {
//                System.out.println("программа завершила работу");
//                break;
//            }
//            String country = Day_3.day3(a);
//        }
//            scanner.close();
//
//    }
//}

// меня эта программа замучала, целый день ее делала, код написала правильно,
// а как работать с двумя классами не знаю.
// И целый день переставляла, потом уже ИИ воспользовалась,
// там увидела цикл while, до этого у меня был if-else.
// Потом у меня выводила тупо тот же город,который я ввожу.
// В общем, работа в двумя классами сложна и мне пока не понятна.

//2
//        Scanner scanner = new Scanner(System.in);
//        day_3 day3_2 = new day_3();
//        System.out.println("Добро пожаловать");
//        System.out.print("Введите первое число: ");
//        double num1 = scanner.nextDouble();
//        System.out.print("Введите второе число: ");
//        double num2 = scanner.nextDouble();
//        double result;
//        if (num2 == 0) {
//            System.out.println("ошибка");
//        } else {
//            result = num1 / num2;
//            System.out.println("Результат: " + result);
//
//        }
//        scanner.close();


        //3

        Scanner scanner = new Scanner(System.in);
        day_3 day3_2 = new day_3();
        for(int i= 1; i <= 5; i++){
        System.out.println("Добро пожаловать");
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        if (num2 == 0) {
            System.out.println("Деление на 0");
            continue;
        } else {
            double result = num1 / num2;
            System.out.println("Результат: " + result);
        }
        }
        scanner.close();
    }
}
