public class Griffindor extends Hogwarts {
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

    public String compareTo(Griffindor[] other) {
        String bestStudent;
        int thisCount = this.bravery + this.honor + this.nobility;
        for (int i = 1; i < other.length; i++) {


            int otherCount = other[i].bravery + other[i].honor + other[i].nobility;
            if (thisCount > otherCount) {
                bestStudent = thisCount;
                return this.getName() + " " + this.getSurname() + bestStudent;
            } else {
                bestStudent = otherCount;
                return other[i].getName() + " " + other[i].getSurname() + bestStudent;


            }


        }
    }
}


