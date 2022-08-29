package Animals.Herbivorous.SmallestRodents;

import Animals.Herbivorous.Rodents;

public class Smallest extends Rodents {

    private int teeth;

    public Smallest(String name, int fur, int tail) {
        super(fur, tail);
        this.name = name;
    }

    public Smallest(String name, int fur, int tail, int teeth) {
        super(fur, tail);
        this.name = name;
        this.teeth = teeth;
    }

    @Override
    public void info() {
        super.info();
        if (!(teeth == 0)) {
            System.out.println("size - " + teeth);
        }
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println(" Are active at night.");
    }
}



