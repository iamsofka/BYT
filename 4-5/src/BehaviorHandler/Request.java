package BehaviorHandler;

public class Request {
    private BehaviorState state = new Ordered();

    // getter, setter

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.current();
    }

    public void setState(BehaviorState state) {
        this.state = state;
    }
}
