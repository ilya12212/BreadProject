public class Baguette extends Bread{
    int countLongitudinalScars;
    double length;
    String name;

    public Baguette(int price, double weight, String name, double length, int countLongitudinalScars) {
        super(price, weight);
        this.name = name;
        this.length = length;
        this.countLongitudinalScars = countLongitudinalScars;
        super.bake();
    }

    public  void scar(){
        System.out.println("Scared!");
    }


    public void toWrapUp() {
        System.out.println("Only in an eco-friendly package!");
    }

    public double getLength() {
        return length;
    }

    public int getCountLongitudinalScars() {
        return countLongitudinalScars;
    }

    public void setCountLongitudinalScars(int countLongitudinalScars) {
        this.countLongitudinalScars = countLongitudinalScars;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Baguette{" +
                "countLongitudinalScars=" + countLongitudinalScars +
                ", length=" + length +
                ", price=" + price +
                ", weight=" + weight +
                ", Name=" + name +
                '}';
    }
}
