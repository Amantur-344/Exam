package Zadacha3;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private List<Integer> apple = new ArrayList<>();
    private List<Flat> book = new ArrayList<>();
    private List<Cylinder> cococola = new ArrayList<>();


    public Backpack(){

    }

    public Backpack(List<Integer> apple, List<Flat> book, List<Cylinder> cococola) {
        this.apple = apple;
        this.book = book;
        this.cococola = cococola;
    }

    public List<Integer> getApple() {
        return apple;
    }

    public void setApple(List<Integer> apple) {
        this.apple = apple;
    }

    public List<Flat> getBook() {
        return book;
    }

    public void setBook(List<Flat> book) {
        this.book = book;
    }

    public List<Cylinder> getCococola() {
        return cococola;
    }

    public void setCococola(List<Cylinder> cococola) {
        this.cococola = cococola;
    }
}
