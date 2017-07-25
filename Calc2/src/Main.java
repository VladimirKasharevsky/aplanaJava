import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Operations oper = new Operations();

        float num1 = 0;
        float num2 = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            //   System.out.println("Введите 1е число");

            // num1 = scanner.nextFloat();

            System.out.println("Введите число (или 111111 для выхода)");
            num2 = scanner.nextFloat();

            System.out.println("Введите арифметический оператор");
            String action = scanner.next();

            try {

                switch (action) {
                    case "+":
                        System.out.println(String.valueOf(oper.summ(num1, num2)));
                        num1 = oper.summ(num1, num2);
                        break;
                    case "-":
                        System.out.println(String.valueOf(oper.minus(num1, num2)));
                        num1 = oper.minus(num1, num2);
                        break;
                    case "/":
                        System.out.println(String.valueOf(oper.div(num1, num2)));
                        num1 = oper.div(num1, num2);
                        break;
                    case "*":
                        System.out.println(String.valueOf(oper.mul(num1, num2)));
                        num1 = oper.minus(num1, num2);
                        break;
                    default:
                        System.out.println("Операция не выполнена: неизвестный оператор");
                        break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Деление на 0");
            }
            }while (num2 != 11111) ;

        scanner.close();
        }


}
