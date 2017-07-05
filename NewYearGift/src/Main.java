public class Main {

    public static void main(String[] args) {
        Staff s = new Staff("Конфета ",10,10);
        Staff s1 = new Staff();

        s1.setName("Шоколад ");
        s1.setWeigth(1);
        s1.setPrice(1);

        String[] str = {s1.gift(),s.gift()};

        double weight = s.getWeigth()+s1.getWeigth();
        double price = s.getWeigth()+s1.getWeigth();

        for(int i = 0; i < str.length; i++ ){

            System.out.println(str[i]);
        }
        System.out.println("Цена подарка " + price +" Вес подарка" + weight);
    }
}
