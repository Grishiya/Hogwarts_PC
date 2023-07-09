public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Griffindor [] griffindors={
                new Griffindor("Гарри","Поттер",80,60,100,100,
                        100),
                new Griffindor("Рон","Уизли",45,25,65,
                        90,80),
                new Griffindor("Гермиона","Грейнджер",75,92,76,
                        80,80)
        };
        for (int i = 0; i < griffindors.length; i++) {
            Griffindor griffindor=griffindors[i];
            System.out.println(griffindor);
        }
    }

}