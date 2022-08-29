package Animals;

public abstract class Animals {

    private int furlength = 0;
    private int taillenth = 0;
    public String name = "???";

    abstract public void describe();

    public int getFur() {
        return furlength;
    }

    public void setFur(int fur) {
        this.furlength = fur;
    }

    public int getTail() {
        return taillenth;
    }

    public void setTail(int tail) {
        this.taillenth = tail;
    }

    public void info() {
        System.out.println(name + ":\nfur- " + getFur() + ":\ntail - " + getTail());
    }
}
