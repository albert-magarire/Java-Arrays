public interface MyList {
    // all methods as described in the UML
    int size();
    Object get(int index);
    void add(Object obj);
    void add(int index, Object obj);
    void remove(int index);
    void remove(Object obj);
    void set(int index, Object obj);
    boolean contains(Object obj);
    int indexOf(Object obj);
    boolean isEmpty();
    void removeAll();
}
