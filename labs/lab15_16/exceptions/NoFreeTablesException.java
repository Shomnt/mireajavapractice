package labs.lab15_16.exceptions;

public class NoFreeTablesException extends Exception {
    private int count;

    public NoFreeTablesException(int count){
        super("Все столики заняты! Всего столов: "+count);
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
