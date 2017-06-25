import java.util.Scanner; // импорт класса Scanner для ввода значений в консоль

/**
 *
 * created by Kasharevsky Vladimir
 * @autor Kasharevsky Vladimir
 * @see #main(String[]) ain()
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // объявил использование сканнера

        System.out.println("Введите 1е число");   // вводим первое число
        float num1 = scanner.nextFloat();

        System.out.println("Введите 2е число");  // вводим второе число
        float num2 = scanner.nextFloat();

        System.out.println("Введите арифметический оператор");  // вводим оператор
        String oper = scanner.next();

        switch (oper) {                                        //case конструкция для действий в соответствии с вводимым оператором
            case "+":
                System.out.printf("%010.4f",(num2 + num2));
                break;
            case "-":
                System.out.printf("%010.4f",(num2 - num2));
                break;
            case "/":
                System.out.printf("%010.4f",(num2 / num2));
                break;
            case "*":
                System.out.printf("%010.4f",(num2 * num2));
                break;
            default: System.out.println("Операция не выполнена: неизвестный оператор");
                break;
        }

        scanner.close();
    }
}