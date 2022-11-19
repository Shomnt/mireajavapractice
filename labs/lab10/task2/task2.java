package labs.lab10.task2;

public class task2<E> {
    private E [] arr;

    public task2(E [] arr){
        this.arr = arr;
    }

    public E getArrIndex(int i){
        return  arr[i] ;
    }

    public int getLength(){
        return  arr.length ;
    }
}
