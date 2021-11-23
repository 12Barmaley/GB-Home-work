package java2.hw1;

public class Main {
    public static void main(String[] args) {

        Competitor cat = new Cat("Tima", 4);
        Competitor cat1 = new Cat("Nil", 12);
        Competitor dog = new Dog("Barton", 6);
        Competitor dog1 = new Dog("Ben", 8);

        Competitor[] competitors = new Competitor[]{cat, dog, cat1, dog1};


        Team team = new Team("Cats&Dogs", competitors);


        Course c = new Course();

        team.info();


        c.doIt(team);


        team.showResults();

    }

}
