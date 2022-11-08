package practice.prac9;

import java.util.*;

public class UIclass {


    public static void verification(String str_inn){
        int[] n1 = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int[] n2 = {3, 7, 2, 4, 10, 3, 5, 9, 4, 6, 8};


        if (str_inn.length() != 10 && str_inn.length() != 12){
            throw new NullPointerException("ИНН имеет неверную длину");
        }

        if(str_inn.length() == 10){
            int sum = 0;
            for(int i = 2; i < n2.length; i++){
                sum += (Integer.parseInt(String.valueOf(str_inn.charAt(i-2)))*n2[i]);
            }
            if(sum%11 != Integer.parseInt(String.valueOf(str_inn.charAt(9)))){
                throw new NullPointerException("ИНН недействителен");
            }

        }

        if(str_inn.length() == 12){
            int sum1 = 0;
            int sum2 = 0;

            for(int i = 0; i < n1.length; i++){
                sum1 += (Integer.parseInt(String.valueOf(str_inn.charAt(i)))*n1[i]);
            }

            for(int i = 0; i < n2.length; i++){
                sum2 += (Integer.parseInt(String.valueOf(str_inn.charAt(i)))*n2[i]);
            }

            if(sum1%11 != Integer.parseInt(String.valueOf(str_inn.charAt(10))) && sum2%11 != Integer.parseInt(String.valueOf(str_inn.charAt(11)))){
                throw new NullPointerException("ИНН недействителен");
            }

        }


    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String data;
        String[] data_split;
        List<Person> clients = new ArrayList<>();


        System.out.println("Если хотите закончить программу, укажите как данные пустую строку");
        while(true){
            System.out.println("Ведите данные покупателя:");
            data = scanner.nextLine();
            if(Objects.equals(data, "")){
                break;
            }
            data_split = data.split("\\s");
            if(data_split.length != 3){
                System.out.println("Неверный формат ввода, попробуйте снова");
                continue;
            }

            try{
                verification(data_split[2]);
                clients.add(new Person(data_split[0], data_split[1], data_split[2]));
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
            }

            data = "";
            Arrays.fill(data_split, null);
        }

        for (int i = 0; i < clients.size(); i++){
            System.out.println(clients.get(i));
        }
    }




}
