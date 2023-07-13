public class Puffenduy extends Hogwarts {
    private final int industriousness;
    private final int honesty;
    private final int fealty;

    public Puffenduy(String name, String surname, int magicPower, int skillRange, int industriousness, int honesty, int fealty) {
        super(name, surname, magicPower, skillRange);
        this.industriousness = industriousness;
        this.honesty = honesty;
        this.fealty = fealty ;
    }


    @Override
    public String toString() {
        return super.toString() +
                "Трудолюбие = " + industriousness +
                ", верность = " + honesty +
                ", честность = " + fealty +
                " .";
    }

    public void compareTo(Puffenduy other) {
        int thisCount = this.industriousness + this.honesty + this.fealty;
        int otherCount = other.industriousness + other.honesty + other.fealty;
        super.compareStudent(thisCount, otherCount, this.getName(), other.getName() , "Пуффендуец");
    }


}