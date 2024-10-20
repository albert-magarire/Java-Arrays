import java.util.Arrays;

public class MyArrayList implements MyList {
    private Object[] elements;
    private int count;

    public MyArrayList() {
        //initializing the capcity to 10
        elements = new Object[10];
        count = 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return elements[index];
    }

    @Override
    public void add(Object obj) {
        ensureCapacity();
        elements[count++] = obj;
    }

    @Override
    public void add(int index, Object obj) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, count - index);
        elements[index] = obj;
        count++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        System.arraycopy(elements, index + 1, elements, index, count - index - 1);
        elements[--count] = null; // just tryung to avoid memory leaks
    }

    @Override
    public void remove(Object obj) {
        int index = indexOf(obj);
        if (index != -1) {
            remove(index);
        }
    }

    @Override
    public void set(int index, Object obj) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        elements[index] = obj;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public int indexOf(Object obj) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void removeAll() {
        Arrays.fill(elements, 0, count, null);
        count = 0;
    }

    // Checking to make sure that there is enough capacity in the array
    private void ensureCapacity() {
        if (count == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }

    // Displaing the list content
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            sb.append(elements[i]);
            if (i < count - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
