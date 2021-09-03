package geekbrains.Lesson6;

public class Cat extends Animal {

    public static int countCat = 0;
    public static String type = "Cat";

    Cat(String name, float maxRun, float maxSwim) {
        super(type, name, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    protected boolean run(float distance) {
        return super.run(distance);
    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_NONE;
    }

}
