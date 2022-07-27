
package Trabajo;

import java.util.Scanner;
import java.util.ArrayList;

/**
 Modulo del pago de nomina de XXX Empresa
 */
public class Empresa {
    Scanner input;
    ArrayList <Empleados> datos;

    public Empresa() {
        datos = new ArrayList();
        input = new Scanner(System.in);
    }
    public void CrearEmpleado() {
        String cedula;
        String nombre;
        String apellido;
        String telefono;
        String cargo;
        System.out.print("Identificación: ");
        cedula = input.nextLine();
        System.out.print("Nombres: ");
        nombre = input.nextLine();
        System.out.print("Apellidos: ");
        apellido = input.nextLine();
        System.out.print("Cargo: ");
        cargo = input.nextLine();
        System.out.print("Telefono: ");
        telefono = input.nextLine();
        Empleados E = new Empleados(nombre, apellido, cedula, telefono, cargo);
        datos.add(E);
    }
    public void Nomima(){
        double salario;
        int horaEx;
        int horaMes;
        double salud;
        double pension;
        double arl;
        String cedula;
        System.out.println("Horas trabajadas: ");
        horaMes = input.nextInt();
        System.out.println("Horas Extras: ");
        horaEx = input.nextInt();
        System.out.println("Identificación");
        cedula = input.nextLine();
        int posicion = buscar(cedula);
        if (posicion >= 0){ // si se encuentra en la lista
            String cargo = datos.get(posicion).getcargo(); //nos va a encontrar el cargo de la persona buscada
            switch (cargo){
                case "ADMINISTRATIVO":
                    salario = horaMes * 20000;
                    Devengado dev = new Devengado(salario, horaEx, horaMes);
                    salud = salario * 0.04;
                    pension = salario * 0.04;
                    arl = salario * 0.00522;
                    Deducido ded = new Deducido(salud, pension, arl);
                    break;
                case "OPERATIVO":
                    break;
            }
        }
    }
    private int buscar(String cedula){ //metodo para buscar la posicion del empleado dentro de la lista.
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getCedula().equals(cedula)){
            return i;
        }
        
        }
        return -1; //no encontro a la persona
    }
    public static void main(String[] args) {
        // Creamos el menú principal
        Empresa Em = new Empresa();
        boolean continuar = true;
        do { 
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1 - CARGAR PERSONAL");
            System.out.println("2 - LISTAR");
            System.out.println("3 - BUSCAR");
            System.out.println("4 - SALIR.");
            System.out.print("Seleccione la opción principal: ");
            String opc;
            opc = Em.input.nextLine();
            switch (opc){
                case "1":
                    System.out.println("Pago de nomina a ADMINISTRATIVOS");
                    Em.CrearEmpleado();
                    break;
                case "2":
                    System.out.println("Pago de nomina a OPERATIVOS");
                    break;
                case "3":
                    System.out.println("FIN");
                    continuar = false;
                default:
                    System.out.println("Error, Intente de nuevo!");
                    break;
            }
        } while (continuar==true);
    }

    
    
}
