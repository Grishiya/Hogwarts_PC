public class Puffenduy extends Hogwarts{
   private int industriousness;
    private int honesty;
    private int fealty;

 public Puffenduy(String name, String surname, int magicPower, int skillRange, int industriousness, int honesty, int fealty) {
  super(name, surname, magicPower, skillRange);
  this.industriousness = industriousness;
  this.honesty = honesty;
  this.fealty = fealty;
 }

 public int getIndustriousness() {
  return industriousness;
 }

 public void setIndustriousness(int industriousness) {
  this.industriousness = industriousness;
 }

 public int getHonesty() {
  return honesty;
 }

 public void setHonesty(int honesty) {
  this.honesty = honesty;
 }

 public int getFealty() {
  return fealty;
 }

 public void setFealty(int fealty) {
  this.fealty = fealty;
 }
 @Override
 public String toString (){
  return super.toString()+
          "Трудолюбие = "+industriousness+
          ", верность = "+honesty+
          ", честность = "+fealty+
          " .";
 }
}
