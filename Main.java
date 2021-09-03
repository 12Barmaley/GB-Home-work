package geekbrains.Lesson6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsik", 200, 10);
        Animal dog = new Dog("Tor", 500, 10);

        Animal[] animals = new Animal[2];
        animals[0] = cat;
        animals[1] = dog;

        String tempWinEvent = "";
        String tempLossEvent = " не";

        float runLength = 250;
        float swimLength = 2;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName();
            String eventName = " пробежал ";
            String eventResult = animals[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(eventName, nameString, runLength, eventResult);
            int swimResult = animals[i].swim(swimLength);
            eventName = " проплыл ";
            eventResult = (swimResult == Animal.SWIM_OK) ? tempWinEvent : tempLossEvent;
            if (swimResult == Animal.SWIM_NONE) {
                eventResult = " не умеет плавать";
                result(nameString, eventResult);
            } else
                result(eventName, nameString, swimLength, eventResult);
        }
    }

    private static void result(String event, String nameAnimal, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + resultEvent + event + eventLength + " м");
    }

    private static void result(String nameAnimal, String resultEvent) {
        System.out.println(nameAnimal + resultEvent);
    }
}

