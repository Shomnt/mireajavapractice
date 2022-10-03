package labs.lab2;
import java.lang.*;
public class Book {

    private String name;
    private int pageCount;

    private String author;

    private int year;

    public Book(String name, int pageCount, String author, int year){
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
        this.year = year;
    }

    public Book(String name, int pageCount, String author){
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
        int year = 2000;
    }

    public Book(String name, int pageCount){
        this.name = name;
        this.pageCount = pageCount;
        this.author = "john doe";
        int year = 2000;
    }
    public Book(String name){
        this.name = name;
        this.pageCount = 200;
        this.author = "me";
        int year = 2000;
    }

    public Book(){
        this.name = "I want to sleep";
        this.pageCount = 200;
        this.author = "me";
        int year = 2000;
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

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString(){
        return this.name+", page count "+this.pageCount + ", author " + this.author + ", year " + this.year;
    }
}