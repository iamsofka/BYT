package BehaviorHandler;

public class Ordered implements BehaviorState{
    @Override
    public void prev(Request req) {
        System.out.println("Initial state");
    }

    @Override
    public void next(Request req) {
        req.setState(new Delivered());
    }

    @Override
    public void current() {
        System.out.println("It has been ordered");
    }
}
