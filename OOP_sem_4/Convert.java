public class Convert<T> {
    private T toJsonString;

    public Convert(T toJsonString) {
        this.toJsonString = toJsonString;
    }

    public T getToJsonString() {
        
        return this.toJsonString;
    }

    @Override
    public String toString() {
        return String.format("%s", toJsonString);
    }
}
