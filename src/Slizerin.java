public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resoursefulness;
    private int domination;

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

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResoursefulness() {
        return resoursefulness;
    }

    public void setResoursefulness(int resoursefulness) {
        this.resoursefulness = resoursefulness;
    }

    public int getDomination() {
        return domination;
    }

    public void setDomination(int domination) {
        this.domination = domination;
    }
    @Override
    public String toString(){
        return super.toString()+
                "Хитрость = "+ cunning+
                ", решитильность = "+ determination+
                ", амбициозность = "+ambition+
                ", находчивость = "+resoursefulness+
                ", жажда власти = "+domination+" .";
    }
}