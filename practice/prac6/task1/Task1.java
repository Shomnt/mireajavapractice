package practice.prac6.task1;

public class Task1 {
    public static void main(String[] args){

        Student st1 = new Student("Lavka A.D.", 113);
        Student st2 = new Student("Ivanov I.A.", 45);
        Student st3 = new Student("Aboba D.V.", 9);
        Student st4 = new Student("Bormincev A.V.", 626);
        Student st5 = new Student("Geroev A.I.", 43);
        Student st6 = new Student("Andreev V.D.", 120);

        Student temp;

        Student[] array = {st1, st2, st3, st4, st5, st6};

        for(int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
        System.out.println("   ");
        for (int left = 0; left < array.length; left++) {
            int value = array[left].getiDNumber();
            temp = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i].getiDNumber()) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = temp;
        }
        for(int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
    }
}
