package practice.prac1.task3;

import java.lang.*;

public class Book {

    private String name;
    private int pageCount;

    public Book(String name, int pageCount){
        this.name = name;
        this.pageCount = pageCount;
    }

    public Book(String name){
        this.name = name;
        this.pageCount = 60;
    }

    public Book(){
        this.name = "I want to sleep";
        this.pageCount = 60;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return this.name+", page count "+this.pageCount;
    }

    public void small_or_big(){
        if (pageCount >= 200) {
            System.out.println("Книга " + name + " большая");
        }else{
            System.out.println("Книга " + name + " маленькая");
        }

    }
}