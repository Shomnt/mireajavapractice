package practice.prac8;

import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList{
    protected ConcurrentLinkedQueue<E> content;

    final protected Queue data = new ConcurrentLinkedQueue<>();
    final protected Queue deleted = new ConcurrentLinkedQueue<>();

    public WaitList(){

    }

    public WaitList(Collection<E> c){
        data.addAll(c);
    }

    @Override
    public String toString() {
        return "WaitList{" +
                " data=" + data +
                '}';
    }

    @Override
    public void add(Object element) {
        data.add(element);
    }

    @Override
    public Object remove() {
        return data.remove();
    }

    @Override
    public boolean contains(Object element) {
        return data.contains(element);
    }

    @Override
    public boolean containsAll(Collection c) {
        return data.containsAll(c);
    }
}
