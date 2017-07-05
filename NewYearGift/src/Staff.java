
public class Staff {

    private String name;
    private double weigth;
    private double price;

    public Staff() {
        this.name = name;
        this.weigth = weigth;
        this.price = price;
    }

    public Staff(String name, double weigth, double price) {
        this.name = name;
        this.weigth = weigth;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeigth() {
        return weigth;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String gift(){
        return "Имя: "+ name +" Вес: "+ weigth +" Цена: " + price;
    }
}
