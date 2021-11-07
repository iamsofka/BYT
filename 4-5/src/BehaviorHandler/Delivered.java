package BehaviorHandler;

public class Delivered implements BehaviorState{
    @Override
    public void prev(Request req) {
        req.setState((new Ordered()));
    }

    @Override
    public void next(Request req) {
        req.setState(new Received());
    }

    @Override
    public void current() {
        System.out.println("Package is delivered");
    }
}
