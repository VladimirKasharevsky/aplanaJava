import java.util.Scanner;

public class Calc {

    public void calc(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1е число");
        float num1 = scanner.nextFloat();

        System.out.println("Введите 2е число");
        float num2 = scanner.nextFloat();

        System.out.println("Введите арифметический оператор");
        String oper = scanner.next();

        switch (oper) {
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
