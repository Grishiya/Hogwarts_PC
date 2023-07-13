public class Main {
    public static void main(String[] args) {


        Griffindor harry = new Griffindor("Гарри", "Поттер", 80, 60,
                100, 100,
                100);
        Griffindor ron = new Griffindor("Рон", "Уизли", 45, 25, 65,
                90, 80);
        Griffindor germiona = new Griffindor("Гермиона", "Грейнджер",
                75, 92, 76,
                80, 80);

        Slizerin drako = new Slizerin("Драко", "Малфой", 56, 50,
                75, 32,
                70, 10, 80);

        Slizerin grehem = new Slizerin("Грэхэм", "Монтегю", 15, 10,
                32, 24, 26,
                23, 15);

        Slizerin gregori = new Slizerin("Грегори", "Гойл", 32, 32,
                45, 32,
                76, 54, 43);
        Puffenduy zahariya = new Puffenduy("Захария", "Смит", 12, 4,
                57, 76,
                80);
        Puffenduy sedrig = new Puffenduy("Седриг", "Диггори", 76, 54,
                67,
                87, 65);
        Puffenduy djastin = new Puffenduy("Джастин", "Финч-Флетчли", 32, 12
                , 65,
                56, 65);
        Kogtevran chjou = new Kogtevran("Чжоу", "Чанг", 65, 65, 32,
                45, 78,
                54);
        Kogtevran padma = new Kogtevran("Падма", "Патил", 43, 23, 65, 34,
                65, 76);
        Kogtevran markus = new Kogtevran("Маркус", "Белби", 32, 32, 32, 32,
                32, 32);


        System.out.println(harry);
        System.out.println(ron);
        System.out.println(germiona);
        System.out.println();
        harry.compareTo(ron);
        harry.compareTo(germiona);
        System.out.println();
        System.out.println(drako);
        System.out.println(gregori);
        System.out.println(grehem);
        System.out.println();
        drako.compareTo(gregori);
        drako.compareTo(grehem);
        System.out.println();
        System.out.println(zahariya);
        System.out.println(sedrig);
        System.out.println(djastin);
        System.out.println();
        zahariya.compareTo(sedrig);
        zahariya.compareTo(djastin);
        System.out.println();
        System.out.println(chjou);
        System.out.println(padma);
        System.out.println(markus);
        System.out.println();
        chjou.compareTo(padma);
        chjou.compareTo(markus);
        System.out.println();
        harry.compareTo(drako);
        drako.compareTo(ron);

    }

}