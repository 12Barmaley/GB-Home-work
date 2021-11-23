package java2.hw1;

public class Team {
    private String name;
    private Competitor[] competitors;

    public Team(String name, Competitor[] competitors) {
        this.name = name;
        this.competitors = competitors;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void showResults() {
        System.out.println();
        System.out.println("* * *");
        System.out.println();
        System.out.println("Участники прошедшие дистанцию:");
        for (Competitor competitor : competitors) {
            if (competitor.isJumpOverWall()) {
                System.out.println(competitor.getName());
            }
        }
    }

    public void info() {
        System.out.println();
        System.out.println("* * *");
        System.out.println();
        System.out.println("Название команды: " + name);
        System.out.println();
        System.out.println("Список всех участников:");
        for (Competitor competitor : competitors) {
            System.out.println("Имя: " + competitor.getName() + ", высота прыжка: " + competitor.getHighJump());
        }
    }
}
