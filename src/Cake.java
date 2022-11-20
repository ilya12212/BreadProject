public class Cake extends Bread{

    public Cake(int price, double weight) {
        super(price, weight);
        super.bake();
        super.toWrapUp();
    }

    public  void applyPatterns(){
        System.out.println("Apply patterns!");
    }
    public  void  locate(){
        System.out.println("Located!");
    }
    @Override
    public String toString() {
        return "Cake{" +
                "price = " + price +
                ", weight = " + weight +
                '}';
    }



}
