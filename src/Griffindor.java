public class Griffindor extends Hogwarts{
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int magicPower, int skillRange,
                      int nobility, int honor, int bravery) {
        super(name, surname, magicPower, skillRange);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + ". Благородство - "
                + nobility + ". Честь - " + honor
                + ". Отвага - " + bravery;
    }

    public void compareTo(Griffindor other) {
        int thisCount = this.bravery + this.honor + this.nobility;
        int otherCount = other.bravery + other.honor + other.nobility;
        super.compareStudent(thisCount,otherCount,this.getName(),other.getName(),"Гриффиндорец");

    }

    private void printComparingResult(Griffindor bestStudent, Griffindor worseStudent) {
        System.out.println(bestStudent.getName() + " " + bestStudent.getSurname() +
                " лучшe  чем " + worseStudent.getName() + " "+worseStudent.getSurname());
    }
}