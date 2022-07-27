
package Trabajo;

import java.text.DecimalFormat;
import java.util.Scanner;


public class ejercicio2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        DecimalFormat f = new DecimalFormat("###");
        Scanner input = new Scanner(System.in);

        System.out.println("******************************************");
        System.out.println("***************TransCaribeCol*************");
        System.out.println("**************MODULO DE NOMINA************");
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println("");

        System.out.println("Numero de trabajadores operativos: ");
        int n = Integer.parseInt(input.nextLine());

        String nombre[] = new String[n];
        String cargo[] = new String[n];

        int VhrTrabajadas[] = new int[n];
        int Htrabajadas[] = new int[n];
        int salarioBruto[] = new int[n];
        int horasExtras[] = new int[n];
        int valor_horaExtra[] = new int[n];
        int total_horas_extra[] = new int[n];

        double salud[] = new double[n];
        double pension[] = new double[n];
        double arl[] = new double[n];
        double total_prestaciones[] = new double[n];
        double total_pagar[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("TIPO DE CARGO: ");
            cargo[i] = input.nextLine();
            System.out.println("INGRESE NOMBRE DEL TRABAJADOR: " + (i + 1) + ": ");
            nombre[i] = input.nextLine();

            System.out.println("CARGO: ");
            cargo[i] = input.nextLine();

            System.out.println("horas trabajadas(MES): ");
            Htrabajadas[i] = Integer.parseInt(input.nextLine());

            System.out.println("valor horas trabajadas: ");
            VhrTrabajadas[i] = Integer.parseInt(input.nextLine());

            System.out.println("horas extras: ");
            horasExtras[i] = Integer.parseInt(input.nextLine());

            System.out.println("valor hora extra: ");
            valor_horaExtra[i] = Integer.parseInt(input.nextLine());
            
        }
        
        for (int i = 0; i < n; i++) {
            if(n >0){
                
           
            
            salarioBruto[i] = Htrabajadas[i] * VhrTrabajadas[i];

            total_horas_extra[i] = valor_horaExtra[i] * horasExtras[i];

            salud[i] = (salarioBruto[i] + total_horas_extra[i])* 0.04;

            pension[i] = (salarioBruto[i] + total_horas_extra[i])* 0.04;

            arl[i] = (salarioBruto[i] + total_horas_extra[i]) * 0.00522;

            
            total_prestaciones[i] = (salud[i] + pension[i]) + arl[i];

            total_pagar[i] = (salarioBruto[i] + total_horas_extra[i]) - total_prestaciones[i];

            System.out.println("*******************************************");
            System.out.println("*************VOLANTE DE PAGO***************");
            System.out.println("*******************************************");
            System.out.println("NOMBRE: " + nombre[i]);
            System.out.println("CARGO; " + cargo[i]);
            System.out.println("HORAS TRABAJADAS: " + Htrabajadas[i]);
            System.out.println("SALARIO BURUTO: " + salarioBruto[i]);
            System.out.println("HORAS EXTRAS: " + horasExtras[i]);
            System.out.println("TOTAL PAGO HORAS EXTRAS: " + total_horas_extra[i]);

            System.out.println("");

            System.out.println("*********************************************");
            System.out.println("*************DESCUENTOS DE LEY***************");
            System.out.println("*********************************************");

            System.out.println("");

            System.out.println("SALUD(4%): " + f.format(salud[i]));
            System.out.println("PENSION(4%): " + f.format(pension[i]));
            System.out.println("ARL(0.0522%): " +arl[i]);

            System.out.println("");

            System.out.println("TOTAL DESCUENTO: " + f.format(total_prestaciones[i]));
            System.out.println("TOTAL A PAGAR: " + f.format(total_pagar[i]));

            System.out.println("");

            System.out.println("************************************************");
            System.out.println("*************FIN VOLANTE DE PAGO****************");
            System.out.println("************************************************");
            }
        }
    
    }
    
}
