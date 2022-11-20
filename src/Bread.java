public class Bread {
    int price;
    double weight;

    public  Bread(int price, double weight){
    this.price = price;
    this.weight =weight;
    }

    public  void  toWrapUp(){
        System.out.println("To wrap up!");
    }

    public  void bake(){
        System.out.println("Bake!");
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "price = " + price +
                ", weight = " + weight +
                '}';
    }
}
