package observer_lab;

public interface Source {
    public void notifyObserver();
    public void register(Observers observer);
}
