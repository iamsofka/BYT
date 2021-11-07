package BehaviorHandler;

public interface BehaviorState {
    void prev(Request req);
    void next(Request req);
    void current();
}
