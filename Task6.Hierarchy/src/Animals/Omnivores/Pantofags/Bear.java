package Animals.Omnivores.Pantofags;

import Animals.Omnivores.Omni;

public class Bear extends Omni {
    public Bear(String name, int fur, int tail) {
        super(fur, tail);
        this.name = name;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println(" Lives in the forest");
    }
}