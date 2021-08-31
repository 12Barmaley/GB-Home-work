package geekbrains.Lesson5;

public class Employee {
    String name;
    String position;
    String email;
    String telNbr;
    int salary;
    int age;

    public Employee(String name, String position, String email, String telNbr, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telNbr = telNbr;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println("Name:" + name + "; Position: " + position + "; " +
                "e-mail: " + email + "; telefon number: " + telNbr +
                ";Salary: " + salary + "; Age: " + age);
    }

    public static void main(String[] args) {
        createArray();
    }

    public static void createArray() {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Tom Barnaby", "Chief Inspector", "Barnaby@com", "9(754)7754577", 12000000, 50);
        persArray[1] = new Employee("Endeavour Mors", "Chief Inspector", "Mors@com", "9(754)7754578", 13000000, 30);
        persArray[2] = new Employee("Sherlock Holmes", "Inspector", "Sherlock@com", "9(754)7754597", 11000000, 41);
        persArray[3] = new Employee("Feodor Aniskin", "Inspector", "Aniskin@com", "9(754)7754677", 11000000, 28);
        persArray[4] = new Employee("Dana Scully", "Inspector", "Dana@com", "9(754)7755577", 11000000, 21);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].info();
            }

        }

    }
}


