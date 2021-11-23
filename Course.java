package java2.hw1;

public class Course {
    Wall wall1 = new Wall(10);
    Wall wall2 = new Wall(6);
    Wall[] walls = new Wall[]{wall1, wall2};

    public void doIt(Team team) {
        System.out.println();
        System.out.println("* * * ");
        System.out.println();
        System.out.println("Соревнования начались...");
        System.out.println();

        for (Wall wall : walls) {
            System.out.println("Впереди препятствие... Высота стены " + wall.getHigh() + " м. Пусть каждый из участников попробует ее перепрыгнуть...");

            for (Competitor competitor : team.getCompetitors()) {
                System.out.print(competitor.getName() + "- высота прыжка: " + competitor.getHighJump() + " м. ");
                if (competitor.getHighJump() > wall.getHigh()) {
                    System.out.println(" перепрыгнул через стену");
                } else {
                    System.out.println(" не перепрыгнул");
                    competitor.setJumpOverWall(false);
                }
            }
        }
    }
}

