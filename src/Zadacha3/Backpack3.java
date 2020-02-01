package Zadacha3;

import java.util.List;

public class Backpack3 {
    private List<Circle> apple;
    private List<Circle> tennisBol;
    private List<Flat> papca;
    private List<Cylinder> cococola;

    public Backpack3(){

    }

    public Backpack3(List<Circle> apple, List<Circle> tennisBol, List<Flat> papca, List<Cylinder> cococola) {
        this.apple = apple;
        this.tennisBol = tennisBol;
        this.papca = papca;
        this.cococola = cococola;
    }

    public List<Circle> getApple() {
        return apple;
    }

    public void setApple(List<Circle> apple) {
        this.apple = apple;
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

    public List<Cylinder> getCococola() {
        return cococola;
    }

    public void setCococola(List<Cylinder> cococola) {
        this.cococola = cococola;
    }
}
