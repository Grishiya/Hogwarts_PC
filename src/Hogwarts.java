public abstract class Hogwarts {
    private final String name;
    private final String surname;
    private final int magicPower;
    private final int skillRange;

    public Hogwarts(String name, String surname, int magicPower, int skillRange) {
        this.name =  name;
        this.surname = surname;
        this.magicPower = magicPower;

        this.skillRange = skillRange;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Ученик школы   волшебства Хогвартс. "
                + name + " "
                + surname + " "
                + ". Владеет магией на "
                + magicPower + " баллов. "
                + " дальность умений "
                + skillRange + " метров. ";
     }

    public void compareTo(Hogwarts other) {
        int thisCount = this.magicPower + this.skillRange;
        int otherCount = other.magicPower + other.skillRange;

        compareStudent(thisCount, otherCount, this.name, other.name, " владеет магией");
    }


    private void printComparingResult(String bestStudent, String worseStudent, String parametr) {
        System.out.println(bestStudent  +
                " лучше " + parametr + " чем " + worseStudent);
    }

    public void compareStudent(int countThis, int countOther, String thisName, String other, String parameter) {
        if (countThis > countOther) {
            printComparingResult(thisName, other, parameter);
        } else if (countThis < countOther) {
            printComparingResult(other, thisName, parameter);
        } else {
            System.out.println("Студенты одинаково сильны ");
        }
    }
}

