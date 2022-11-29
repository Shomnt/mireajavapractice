package practice.prac8;

public class UnfairWaitList<E> extends WaitList{
    UnfairWaitList(){}
    public void remove(Object element){
        if(element == data.peek()){
            moveToBack(element);
        }
        else{
            deleted.add(element);
            data.remove(element);
        }
    }
    public void add(Object element){
        if(deleted.contains(element)){
            System.out.println("Невозможно добавить");
        }
        else{
            data.add(element);
        }
    }

    public void moveToBack(Object element){
        data.add(element);
        data.remove(element);
    }
}
