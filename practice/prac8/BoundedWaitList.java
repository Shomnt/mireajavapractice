package practice.prac8;

public class BoundedWaitList<E> extends WaitList{
    private int capacity;

    public BoundedWaitList(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(Object element) {
        super.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                '}';
    }
}
