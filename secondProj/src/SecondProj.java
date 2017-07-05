import java.util.Scanner;

public class SecondProj {


    public static void main(String args[]) {

     Word w = new Word();
     Calc c = new Calc();

     Scanner scanner = new Scanner(System.in);
     System.out.println("Введите номер задачи: 1 - Калькулятор; 2 - Выявление длинного слова; 3 - выход");
     String oper = scanner.next();

        switch (oper) {
            case "1":
                c.calc();
                break;
            case "2":
                w.word();
                break;
            case "3":
                System.out.print("До свидания");
                break;

        }
    }
}