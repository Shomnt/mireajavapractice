package labs.lab1;

public class garmonik {

    private int count;

    public garmonik(int count){
        this.count = count;
    }

    public void printgarm(){
        for (int i = 1; i < count; i++) {
            System.out.print("Число номер " + i + ": ");
            System.out.println(1./i);
        }
    }
}
