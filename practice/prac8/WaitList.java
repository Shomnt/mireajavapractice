package practice.prac8;

import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList{
    protected ConcurrentLinkedQueue<E> content;

    protected Queue data;
    protected Queue deleted;

    public WaitList(){

    }

    public WaitList(Collection<E> c){

    }

    public String toString(){
        return null;
    }

    @Override
    public void add(Object element) {

    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
