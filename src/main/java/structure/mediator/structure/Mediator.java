package structure.mediator.structure;

public interface Mediator {
    void send(String msg, Colleague colleague);
}
