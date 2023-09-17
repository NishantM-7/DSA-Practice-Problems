import java.util.Arrays;

public class CustomArray<T> {

    // public class CustomArray<T exntends Number> {...
    // T extends Number only allows Number or its Sub classes such as
    // Integer,Double, String will not be accepted.

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // Also works as index for the data.

    public CustomArray() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public Object get(int index) {
        return data[index];
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    public void add(T value) {
        if (isFull()) {
            resize();
        }
        data[size++] = value;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return "Custom Array: " + Arrays.toString(data) + "  Size : " + size;
    }
}
