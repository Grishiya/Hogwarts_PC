public class Griffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int  bravery;

    public Griffindor(String name, String surname, int magicPower, int skillRange,
                      int nobility, int honor, int bravery) {
        super(name, surname, magicPower, skillRange);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery =   bravery ;
    }


    @Override
    public  String toString() {
        return super.toString() + ". Благородство - "
                + nobility + ". Честь - " + honor
                + ". Отвага - " + bravery;
    }

    public  void compareTo(Griffindor other) {
        int thisCount = this.bravery + this.honor + this.nobility;
        int otherCount = other.bravery + other.honor + other.nobility;
        super.compareStudent(thisCount, otherCount, this.getName(), other.getName(), "Гриффиндорец");

    }


}