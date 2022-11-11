package practice.prac11_12.task4;

public class Number {

    public static String convert(String number){
        StringBuilder new_number = new StringBuilder();
        int counter = 0;

        if(number.charAt(0) != '+'){
            new_number.append("+7 ");
        }
        else{
            for(int i = 0; i < number.length()-10; i++){
                new_number.append(number.charAt(i));
            }
            new_number.append(" ");
        }

        for(int i = number.length()-10; i < number.length(); i++){
            counter++;
            new_number.append(number.charAt(i));
            if (counter == 3 || counter == 6){
                new_number.append("-");
            }
        }

        return new_number.toString();
    }
}
