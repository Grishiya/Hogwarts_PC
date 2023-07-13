public class Slizerin extends Hogwarts {
    private final int cunning;
    private final int determination;
    private final int ambition;
    private final int resoursefulness;
    private final int  domination;

    public Slizerin(String name, String surname, int magicPower,
                    int skillRange, int cunning, int determination,
                    int ambition, int resoursefulness, int domination) {
        super(name, surname, magicPower, skillRange);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resoursefulness = resoursefulness;
        this.domination = domination;
    }


    @Override
    public String toString() {
        return super.toString() +
                "Хитрость = " + cunning +
                ", решитильность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resoursefulness +
                ", жажда власти = " + domination + " .";
    }

    public void compareTo(Slizerin other) {
        int thisCount = this.cunning + this.determination + this.domination + this.resoursefulness + this.ambition;
        int otherCount = other.cunning + other.determination + other.domination + other.resoursefulness + other.ambition;
        super.compareStudent(thisCount, otherCount, this.getName(), other.getName(), "Слизеринец");
    }
}