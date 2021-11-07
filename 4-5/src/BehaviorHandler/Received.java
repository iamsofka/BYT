package BehaviorHandler;

public class Received implements BehaviorState{
    @Override
    public void prev(Request req) {
        req.setState(new Delivered());
    }

    @Override
    public void next(Request req) {
        System.out.println("No more states");
    }

    @Override
    public void current() {
        System.out.println("Package is received ny the client");
    }
}
