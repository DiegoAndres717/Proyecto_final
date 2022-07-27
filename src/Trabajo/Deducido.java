
package Trabajo;


public class Deducido {
    private double salud;
    private double pension;
    private double arl;
    private boolean bandera = false;

    public Deducido(double salud, double pension, double arl) {
        this.salud = salud;
        this.pension = pension;
        this.arl = arl;
        this.bandera = true;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }

    public double getArl() {
        return arl;
    }

    public void setArl(double arl) {
        this.arl = arl;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }
    
}
