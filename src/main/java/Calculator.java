import java.util.Scanner;

/**
 * @author Anton
 */
/*Калькулятор
Урок 2
*/
public class Calculator {
    public static void main(String[] args) {
//форматирование числа Pi System.out.printf("%+020.10f", Math.PI);
        Scanner scanner = new Scanner(System.in);
// ввод первого значения
        System.out.println("Введите первое число");
        double i = scanner.nextDouble();
// ввод второго значения
        System.out.println("Введите второе число");
        double o = scanner.nextDouble();
// задается переменная сложения
        double sum = o + i;
// вывод результата с форматированием
        System.out.printf("Сумма равна%+020.4f", sum);
// завершение работы сканера
        scanner.close();
    }
}