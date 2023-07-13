public abstract class Hogwarts {
    private String name;
    private String surname;
    private int magicPower;
    private int skillRange;

    public Hogwarts(String name, String surname, int magicPower, int skillRange) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;

        this.skillRange = skillRange;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getSkillRange() {
        return skillRange;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower < 0 && magicPower > 100) {
            System.out.println(" Такой силы магии не бывает");
            return;
        }
        this.magicPower = magicPower;
    }

    public void setSkillRange(int skillRange) {
        if (skillRange < 0 && skillRange > 100) {
            System.out.println("Невозможная дальность умений");
            return;
        }
        this.skillRange = skillRange;
    }

    @Override
    public String toString() {
        return "Ученик школы волшебства Хогвартс. "
                +name+" "
                + surname+" "
                +". Владеет магией на "
                +magicPower + " баллов. "
                +" дальность умений "
                +skillRange + " метров. ";
    }
    public void compareTo(Hogwarts other){
        int thisCount = this.magicPower + this.skillRange;
        int otherCount = other.magicPower + other.skillRange;
        printComparingResult(this.name, other.name, "маг в Хогварсе");

    }



    private void printComparingResult(String bestStudent, String worseStudent,String parametr) {
        System.out.println(bestStudent +
                " лучшe "+ parametr+ " чем " + worseStudent);
    }
    public void compareStudent(int countThis,int countOther,String thisName,String other, String parametr){
        if (countThis>countOther){
            printComparingResult(thisName,other,parametr);
        } else if (countThis < countOther) {
            printComparingResult(other,thisName,parametr);
        }else {
            System.out.println("Студенты одинаково сильны ");
        }
    }
}

