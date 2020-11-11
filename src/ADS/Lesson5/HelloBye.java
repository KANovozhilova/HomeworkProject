package ADS.Lesson5;

public class HelloBye {

    public static void main(String[] args) {
        hello("Артём");
    }

    private static void hello(String name) {
        print("Привет, " + name + "!");
        bye(name);
    }

    private static void bye(String name) {
        print("Пока, " + name + "!");
    }

    private static void print(String message) {
        System.out.println(message);
    }
}
