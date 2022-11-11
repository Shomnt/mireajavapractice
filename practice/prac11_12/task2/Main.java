package practice.prac11_12.task2;

import java.util.*;

/*
Россия, Москва, Москва, Клязьминская, 7, 2, 175
Великобритания, Лондон, Лондон, Marylebone High St, 93, 1, 1
Нидерланды, Амстердам, Амстердам, Polderweg, 648, 1, 1
Германия, Бранденбург, Берлин, Mittelstraße, 1, 1, 1
 */
/*
Россия, Москва, Москва, Клязьминская, 7, 2, 175
Великобритания. Лондон. Лондон. Marylebone High St. 93. 1. 1
Нидерланды; Амстердам; Амстердам; Polderweg; 648; 1; 1
Германия- Бранденбург- Берлин- Mittelstraße- 1- 1- 1
 */
public class Main {
    public static void main(String[] args){
        String adress;
        Scanner scanner = new Scanner(System.in);
        String[] adress_split;
        List<Adress> adresses = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            adress = scanner.nextLine();
            adress_split = adress.split(",");
            adresses.add(new Adress(adress_split[0], adress_split[1], adress_split[2], adress_split[3], adress_split[4], adress_split[5], adress_split[6]));
        }
        for(int i = 0; i < 4; i++) {
            System.out.println(adresses.get(i));
        }


        for(int i = 4; i < 8; i++){
            adress = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(adress, ",.;-");
            adresses.add(new Adress(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken()));
        }
        for(int i = 4; i < 8; i++) {
            System.out.println(adresses.get(i));
        }

    }
}
