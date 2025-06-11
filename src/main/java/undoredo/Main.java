package undoredo;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Start");

        manager.addState("First");
        manager.addState("Second");
        manager.addState("Third");

        manager.Chain();
    }
}
