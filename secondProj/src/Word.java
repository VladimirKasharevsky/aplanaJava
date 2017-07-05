import java.util.Scanner;

public class Word {

    public void word(){

        int max = 0;
        String word = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int num = scanner.nextInt();
        String[] arr = new String[num];
        int i = 0;

        do {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите " + i + " элемент");
        arr[i] = sc.nextLine();
        i++;

    } while (i < num);

        System.out.print("Массив заполнен!!! Самое длинное слово: ");

        for(int t = 0; t < arr.length;t++){

        if(arr[t].length() >= max){

            max = arr[t].length();
            word = arr[t];
        }
    }
        System.out.println(word);
}

}


