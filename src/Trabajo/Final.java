
package Trabajo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Final {
    static Scanner input = new Scanner(System.in);
    
    // PROGRAMA PRINCIPAL
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean continuar = true;
        do {            
            System.out.println("PAGO DE NOMINAS");
            System.out.println("1 - ADMINISTRATIVOS");
            System.out.println("2 - OPERATIVOS");
            System.out.println("3 - SALIR");
            System.out.println("Seleccione la opción principal: ");
            int opc = input.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Pago de nomina a ADMINISTRATIVOS");
                    MenuOperativos();
                    break;
                case 2:
                    System.out.println("Pago de nomina a OPERATIVOS");
                    MenuOperativos();
                    break;
                case 3:
                    System.out.println("FIN");
                    continuar=false;
                    break;
                default:
                    System.out.println("¡Error! Intente de nuevo.");
                    break;
            }
        } while (continuar==true);
    }//CIERRE DEL PROGRAMA PRINCIPAL
    
    
    //FUNCIÓN PARA EL MENU ADMINISTRATIVOS
    public static void MenuAdministrativos(){
        
    }
    public static void MenuOperativos(){
        boolean op = true;
        do {
            System.out.println("Pago de nomina a operativos"); 
            System.out.println("1 - CONDUCTOR");
            System.out.println("2 - OFICIOS GENERALES");
            System.out.println("3 - VIGILANCIA");
            System.out.println("4 - SALIR");
            System.out.println("Seleccion una opción");
            int opc = input.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Pago de nomina a CONDUCTOR");
                  
                       
                    System.out.println("Ingresas conductores");
                    
                    List<String> conductor = new ArrayList<String>();
                        System.out.print("Identificación: ");
                        String cedula = input.nextLine();
                        conductor.add(cedula);
                        System.out.print("Nombres: ");
                        String nombre = input.nextLine();
                        conductor.add(nombre);
                        System.out.print("Apellidos: ");
                        String apellidos = input.nextLine();
                        conductor.add(apellidos);
                        System.out.print("Telefono: ");
                        String telefono = input.nextLine();
                        conductor.add(telefono);
                    
                    break;

                case 2:
                    System.out.println("");
                    
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Retorne al menú principal");
                    op = false;
            }
        } while (op==true);
    }
}
