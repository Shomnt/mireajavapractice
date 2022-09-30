package practice.prac1.task2;

import java.lang.*;

public class Ball {
    private int weight;
    private int circle;

    public Ball(int weight, int circle){
        this.weight = weight;
        this.circle = circle;
    }

    public Ball(int weight){
        this.weight = weight;
        this.circle = 60;
    }

    public Ball(){
        this.weight = 330;
        this.circle = 60;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCircle(int circle) {
        this.circle = circle;
    }

    public int getWeight() {
        return weight;
    }

    public int getCircle() {
        return circle;
    }

    public String toString(){
        return this.weight+", circle "+this.circle;
    }

    public void findSize(){
        if(weight >= 200 && weight <= 222 && circle >= 46 && circle <= 51){
            System.out.println("Мяч имеет первый размер");
        } else if (weight == 284 && circle >= 53 && circle <= 56) {
            System.out.println("Мяч имеет второй размер");
        } else if (weight >= 330 && weight <= 360 && circle >= 58 && circle <= 61) {
            System.out.println("Мяч имеет третий размер");
        } else if (weight >= 350 && weight <= 390 && circle >= 62 && circle <= 64) {
            System.out.println("Мяч имеет четвёртый размер");
        } else if (weight >= 410 && weight <= 450 && circle >= 68 && circle <= 70) {
            System.out.println("Мяч имеет пятый размер");
        }else {
            System.out.println("Мяч с такими характеристиками не подходит ни к одной из основных категорий, либо такого мяча не существует");
        }

    }
}
