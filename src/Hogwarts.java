public class Hogwarts {
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

    public int getMagicPower(int magicPower) {
        if (magicPower < 0 && magicPower > 100) {
            System.out.println("Такой силы магии не бывает");
        }
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
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", magicPower=" + magicPower +
                ", skillRange=" + skillRange +
                '}';
    }
}
