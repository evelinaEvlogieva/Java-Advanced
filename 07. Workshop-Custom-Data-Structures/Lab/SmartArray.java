package Lab;

import java.util.function.Consumer;

public class SmartArray {
    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;

    public SmartArray() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
    }

    public void add(int element) {
        if (this.size == this.capacity) {
            this.resize();
        }
        this.data[this.size++] = element;
    }

    public int get(int index) {
        indexValidation(index);
        return this.data[index];
    }

    public int remove(int index) {
        indexValidation(index);
        int element = this.data[index];
        shiftLeft(index);
        this.size--;

        if (this.size <= this.capacity / 4) {
            shrink();
        }

        return element;
    }

    public void add(int index, int element) {
        indexValidation(index);
        this.size++;
        shiftRight(index);
        this.data[index] = element;

    }

    public boolean contains(int element) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);

        }

    }

    private void indexValidation(int index) {
        if (index < 0 || index >= this.data.length) {
            throw new IndexOutOfBoundsException(String.format("Index %d is out of bounds for lenght %d",
                    index, this.size));
        }

    }

    private void shiftLeft(int index) {
        for (int i = index; i < this.size - 1; i++) {
            this.data[i] = this.data[i + 1];

        }
        this.data[size - 1] = 0;
    }


    private void shiftRight(int index) {
        for (int i = this.size - 1; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }

    }


    private void resize() {
        this.capacity *= 2;
        int[] newData = new int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            newData[i] = data[i];
        }

        this.data = newData;
    }

    private void shrink() {
        this.capacity /= 2;
        int[] newData = new int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            newData[i] = data[i];
        }

        this.data = newData;

    }

}
