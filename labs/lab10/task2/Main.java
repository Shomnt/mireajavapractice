package labs.lab10.task2;

public class Main{
    public static void main(String[] args){
        Integer [] inta = {1,2,3,4,5};
        String [] str = {"ddd", "ffff", "aaaa"};
        Double [] doub = {1.2, 4.3, 56.3, 11.3};

        task2 a1 = new task2(str);
        task2 a2 = new task2(inta);
        task2 a3 = new task2(doub);

        for (int i = 0; i < a1.getLength(); i++){
            System.out.print(a1.getArrIndex(i));
            System.out.print(" ");
        }

        System.out.println();

        for (int i = 0; i < a2.getLength(); i++){
            System.out.print(a2.getArrIndex(i));
            System.out.print(" ");
        }

        System.out.println();

        for (int i = 0; i < a3.getLength(); i++){
            System.out.print(a3.getArrIndex(i));
            System.out.print(" ");
        }

    }
}
