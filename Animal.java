package geekbrains.Lesson6;

public abstract class Animal {

    static final int SWIM_FAIL = 0;
    static final int SWIM_OK = 1;
    static final int SWIM_NONE = -1;

    private String type;
    protected String name;
    private float maxRun;
    private float maxSwim;
    public static int countAnimal = 0;

    Animal(String type, String name, float maxRun, float maxSwim) {
        this.type = type;
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        ++countAnimal;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public float getMaxRun() {
        return maxRun;
    }

    public float getMaxSwim() {
        return maxSwim;
    }

    protected boolean run(float distance) {
        return (distance <= maxRun);
    }
    protected int swim(float distance) {
        return (distance <= maxSwim) ? SWIM_OK : SWIM_FAIL;
    }
}
