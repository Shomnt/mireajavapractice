package labs.lab1;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число, факториал которого вы хотите найти:  ");
        int num;
        num = console.nextInt();
        System.out.println("Ответ:  " + factorial(num));
    }
    public static int factorial(int num){
        int answer = 1;
        for(int i = 1; i <= num; i++){
            answer *= i;
        }
        return answer;
    }
}
