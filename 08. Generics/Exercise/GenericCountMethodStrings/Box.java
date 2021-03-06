package GenericCountMethodStrings;

public class Box<T> {
    private T element;

    public Box(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", element.getClass().getName(), this.element);
    }

    public T getElement() {
        return this.element;
    }
}
