package MetodyGeneryczne.Pair_CosZleSortuje;

public class Pair<T> {
    private T first;
    private T secound;

    public Pair() {
    first = null;
    secound = null;
    }

    public Pair(T first, T secound) {
        this.first = first;
        this.secound = secound;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T newValue) {
        this.first = newValue;
    }

    public T getSecound() {
        return secound;
    }

    public void setSecound(T newValue) {
        this.secound = newValue;
    }
}
