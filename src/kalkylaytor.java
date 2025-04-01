import java.util.Scanner;

public class kalkylaytor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Добро пожаловать в Калькулятор!");
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введите оператор (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();
            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("ошибка");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
            System.out.println("Ошибка! Некорректный оператор.");
            return; // Завершаем программу
        }
            System.out.println("Результат: " + result);
            scanner.close(); // Закрываем Scanner для освобождения ресурсов
        }
    }


