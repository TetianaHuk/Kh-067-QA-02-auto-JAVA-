package Animals.Predators.Feline;

import Animals.Predators.Pre;

public class BiggestFelines extends Pre {
    public int size;

    public BiggestFelines(String name, int fur, int tail) {
        super(fur, tail);
        this.name = name;

    }

    public BiggestFelines(String name, int fur, int tail, int size) {
        super(fur, tail);
        this.name = name;
        this.size = size;
    }

    @Override
    public void info() {
        super.info();
        if (!(size == 0)) {
            System.out.println("minWaterDepth - " + size);
        }
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("One of the biggest predators");
    }
}

