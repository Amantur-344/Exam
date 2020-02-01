package Zadacha3;

import java.util.List;

public class Backpack2 {
    private List<Circle> tennisBol;
    private List<Flat> papca;
    private List<Cylinder> bottle;

    public Backpack2(){

    }

    public Backpack2(List<Circle> tennisBol, List<Flat> papca, List<Cylinder> bottle) {
        this.tennisBol = tennisBol;
        this.papca = papca;
        this.bottle = bottle;
    }

    public List<Circle> getTennisBol() {
        return tennisBol;
    }

    public void setTennisBol(List<Circle> tennisBol) {
        this.tennisBol = tennisBol;
    }

    public List<Flat> getPapca() {
        return papca;
    }

    public void setPapca(List<Flat> papca) {
        this.papca = papca;
    }

    public List<Cylinder> getBottle() {
        return bottle;
    }

    public void setBottle(List<Cylinder> bottle) {
        this.bottle = bottle;
    }
}
