package BehaviorHandler;

public class Demo {
    public static void main(String[] args) {

        Request req = new Request();
        req.printStatus();

        req.nextState();
        req.printStatus();

        req.nextState();
        req.printStatus();

        req.nextState();
    }
}
