public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Griffindor[] griffindorStudent = {
                new Griffindor("Гарри", "Поттер", 80, 60, 100, 100,
                        100),
                new Griffindor("Рон", "Уизли", 45, 25, 65,
                        90, 80),
                new Griffindor("Гермиона", "Грейнджер", 75, 92, 76,
                        80, 80)

        };
        Slizerin[] slizerinStudent = {
                new Slizerin("Драко", "Малфой", 56, 50, 75, 32,
                        70, 10, 80),
                new Slizerin("Грэхэм", "Монтегю", 15, 10, 32, 24, 26,
                        23, 15),
                new Slizerin("Грегори", "Гойл", 32, 32, 45, 32,
                        76, 54, 43)
        };
        Puffenduy[] puffenduyStudent = {
                new Puffenduy("Захария", "Смит", 12, 4, 57, 76,
                        80),
                new Puffenduy("Седриг", "Диггори", 76, 54, 67,
                        87, 65),
                new Puffenduy("Джастин", "Финч-Флетчли", 32, 12, 65,
                        56, 65)
        };
        Kogtevran[] kogtevranStudent = {
                new Kogtevran("Чжоу", "Чанг", 65, 65, 32, 45, 78,
                        54),
                new Kogtevran("Падма", "Патил", 43, 23, 65, 34,
                        65, 76),
                new Kogtevran("Маркус", "Белби", 32, 32, 32, 32,
                        32, 32)
        };
        PrintStudent printStudent = new PrintStudent();
        printStudent.printGriffindorStudent(griffindorStudent);
        printStudent.print();
        printStudent.printSlizerinStudent(slizerinStudent);
        printStudent.print();
        printStudent.printPuffenduyStudent(puffenduyStudent);
        printStudent.print();
        printStudent.printKogtevranStudent(kogtevranStudent);
    }

}