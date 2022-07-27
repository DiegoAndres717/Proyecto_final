
package Trabajo;


public class Empleados {
    private String cargo;
    private String nombre;
    private String Apellido;
    private String Cedula;
    private String telefono;
    private Devengado devengado;
    private Deducido deducido;

    public Empleados(String nombre, String Apellido, String Cedula, String telefono, String cargo) {
        this.cargo = cargo;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.telefono = telefono;
    }
    public String getcargo(){
        return cargo;
    }
    public void setcargo(String cargo){
        this.cargo = cargo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Devengado getDevengado() {
        return devengado;
    }

    public void setDevengado(Devengado devengado) {
        this.devengado = devengado;
    }

    public Deducido getDeducido() {
        return deducido;
    }

    public void setDeducido(Deducido deducido) {
        this.deducido = deducido;
    }
    public void getvolante(){
        
    }
    
    
}
