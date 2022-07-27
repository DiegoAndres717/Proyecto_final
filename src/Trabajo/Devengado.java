
package Trabajo;


public class Devengado {
    private double salario;
    private int horaEx;
    private int horaMes;
    private boolean bandera = false;

    public Devengado(double salario, int horaEx, int horaMes) {
        this.salario = salario;
        this.horaEx = horaEx;
        this.horaMes = horaMes;
        this.bandera = true;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHoraEx() {
        return horaEx;
    }

    public void setHoraEx(int horaEx) {
        this.horaEx = horaEx;
    }

    public int getHoraMes() {
        return horaMes;
    }

    public void setHoraMes(int horaMes) {
        this.horaMes = horaMes;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }
    
}
