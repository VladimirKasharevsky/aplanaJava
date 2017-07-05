import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[20];
        int maxOfminus = -10;
        int minOfplus = 10;
        int p = 0, m = 0;

            for(int i = 0; i < arr.length; i++){
                arr[i] = (int) Math.round((Math.random() * 20) - 10);

                    if((arr[i] < 0) & (arr[i] >= maxOfminus) ){  // поиск максимума из отрицательных чисел

                        maxOfminus = arr[i];
                        m = i;
                    }

                    if((arr[i] > 0) & (arr[i] <= minOfplus) ){  // поиск минимума из положительных чисел

                    minOfplus = arr[i];
                    p = i;
                }
                System.out.print(arr[i] + ",");
                }
        System.out.println();
        System.out.println(maxOfminus + " Индекс "+ m);
        System.out.println(minOfplus + " Индекс "+ p);

        for(int j = 0; j < arr.length; j++){

            if(j == m){

                arr[j] = minOfplus;
            }
            if(j == p){

                arr[j] = maxOfminus;
            }
            System.out.print(arr[j] + ",");
        }
            }

    }