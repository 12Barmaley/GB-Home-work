package geekbrains.Lesson6;

public class Dog extends Animal {
    @Override
    protected boolean run(float distance) {
        return super.run(distance);
    }

    @Override
    protected int swim(float distance) {
        return super.swim(distance);
    }

    public static int countDog = 0;
    public static String type = "Dog";

    Dog(String name, float maxRun, float maxSwim) {
        super(type, name, maxRun, maxSwim);
        ++countDog;
    }
}
