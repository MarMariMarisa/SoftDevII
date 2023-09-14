package practicum2;

public class FibonacciModel {
    private long a;
    private long b;
    private long next;
    private Observer observer;


    public FibonacciModel() {
        a = 0;
        b = 1;
    }

    public void setNext() {
        next = a + b;
        a = b;
        b = next;
        notifyObserver();
        
    }

    public long getNext() {
        return next;
    }
    public void register(Observer observer) {
        this.observer = observer;
    }
    private void notifyObserver() {
        if (this.observer != null) {
            this.observer.update(this);
        }
    }


}

