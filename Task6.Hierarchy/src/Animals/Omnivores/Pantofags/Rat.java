package Animals.Omnivores.Pantofags;

import Animals.Omnivores.Omni;

public class Rat extends Omni {
    public Rat(String name, int fur, int tail) {
        super(fur, tail);
        this.name = name;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println(" Lives everywhere");
    }
}

