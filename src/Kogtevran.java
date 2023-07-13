public class Kogtevran extends Hogwarts {
    private final int mind;
    private final int wisdom;
    private final int wit;
    private final int creativity;

    public Kogtevran(String name, String surname, int magicPower, int skillRange, int mind, int wisdom, int wit, int creativity) {
        super(name, surname, magicPower, skillRange);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity ;
    }


    @Override
    public String toString() {
        return super.toString() +
                "Ум = " + mind +
                ", мудрость = " + wisdom +
                ", остроумие" + wit +
                ", креативность = " + creativity + " .";
    }

    public void compareTo(Kogtevran other) {
        int thisCount = this.mind + this.creativity + this.wit;
        int otherCount = other.mind + other.wit + other.creativity;
        super.compareStudent(thisCount, otherCount, this.getName(), other.getName(), "Когтевранец");
    }
}