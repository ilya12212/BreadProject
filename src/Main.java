public class Main {
    public static void main(String[] args) {
        Cake[] cakes = new Cake[3];
        Pita[] pitas = new Pita[3];
        Baguette[] baguettes = new Baguette[3];
        cakes[0] = new Cake(20,34.2);
        baguettes[0] = new Baguette(20,34.2, "Provance", 3.4,6);
        pitas[0] = new Pita(20,34.2,"Pitas Gjordans");

        System.out.println(cakes[0]);
        cakes[0].applyPatterns();
        cakes[0].locate();
        System.out.println(pitas[0]);
        pitas[0].readyCock();
        System.out.println(baguettes[0]);
        baguettes[0].scar();
        if (cakes[0].weight <= 0){
            System.out.println("Cake is Fake!");
        }
    }
}