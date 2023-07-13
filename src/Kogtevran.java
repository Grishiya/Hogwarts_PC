public class Kogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String name, String surname, int magicPower, int skillRange, int mind, int wisdom, int wit, int creativity) {
        super(name, surname, magicPower, skillRange);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ум = " + mind +
                ", мудрость = " + wit +
                ", креативность = " + creativity + " .";
    }

    public void compareTo(Kogtevran other) {
        int thisCount = this.mind + this.creativity + this.wit;
        int otherCount = other.mind + other.wit + other.creativity;
        super.compareStudent(thisCount,otherCount,this.getName(),other.getName(),"Когтевранец");
    }
    private void printComparingResult(Kogtevran bestStudent, Kogtevran worseStudent){
        System.out.println(bestStudent.getName()+" "+bestStudent.getSurname()+
                " лучшe  чем "+ worseStudent.getName()+ " "+worseStudent.getSurname());
    }
}