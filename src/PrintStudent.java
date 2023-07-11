public class PrintStudent {
    public void printGriffindorStudent(Griffindor[] student) {
        System.out.println("Ученики факультета Гриффиндор !");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            Griffindor griffindor = student[i];
            System.out.println(griffindor);
        }
    }

    public void printSlizerinStudent(Slizerin[] student) {
        System.out.println("Ученики факультета Слизерин !");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            Slizerin slizerin = student[i];
            System.out.println(slizerin);
        }
    }

    public void printPuffenduyStudent(Puffenduy[] student) {
        System.out.println("Ученики факультета Пуффендуй !");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            Puffenduy puffenduy = student[i];
            System.out.println(puffenduy);
        }
    }

    public void printKogtevranStudent(Kogtevran[] student) {
        System.out.println("Ученики факультета Когтевран !");
        System.out.println();
        for (int i = 0; i < student.length; i++) {
            Kogtevran kogtevran = student[i];
            System.out.println(kogtevran);
        }
    }

    public void print() {
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println();
    }
}