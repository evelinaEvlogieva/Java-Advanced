package Lab;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {
    private static final int INITIAL_CAPACITY = 4;
    private int[] items;
    private int size;
    private int capacity;

    public CustomStack() {
        this.items = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }

    public void push(int element) {
        if (this.size == this.capacity) {
            resize();
        }
        this.items[size++] = element;
    }

    public int pop() {
        checkEmpty();
        int element = this.items[this.size - 1];
        this.size--;
        return element;
    }

    public int peek() {
        return this.items[this.size - 1];
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.items[i]);
        }
    }

    private void resize() {
        this.capacity *= 2;
        int[] newItems = new int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            newItems[i] = items[i];

        }
        this.items = newItems;
    }

    private void checkEmpty() {
        if (this.size == 0) {
            throw new NoSuchElementException("The stack is empty");
        }
    }
}
