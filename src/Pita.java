public class Pita extends Bread{
    String name;
    public Pita(int price, double weight, String name) {
        super(price, weight);
        this.name = name;
        super.bake();
        super.toWrapUp();
    }

    public  void readyCock(){
        System.out.println("I'm Lavash, they baked me");
    }

    @Override
    public String toString() {
        return "Pita{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}
