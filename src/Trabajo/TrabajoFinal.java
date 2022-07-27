package Trabajo;

import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TrabajoFinal {
                   
    static Scanner input = new Scanner(System.in);
    static DecimalFormat f = new DecimalFormat();
    static int bandera = 0;//variable global para crear el File por una vez cada ejecución
    static BufferedWriter parrafo = null;//contiene otro metodos mas utiles para escribir ficheros

    public static void main(String[] args) {
        // TODO code application logic here
        boolean continuar = false;
        int op;
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. ADMINISTRATIVOS");
            System.out.println("2. OPERATIVOS");
            System.out.println("3. SALIR");
            System.out.println("Digite la opcion a ejecutar: ");
            op = input.nextInt();
            switch (op) {
                case 1:
                    MenuAdministrativos();
                    break;
                case 2:
                    MenuOperativos();
                    break;
                case 3:
                    System.out.println("Salir");
                    continuar = false;
                    break;
                default:
                    System.out.println("Error");
            }

        } while (continuar = true);
    }

    public static void MenuOperativos() {
        boolean continuar = false;

        do {

            System.out.println("1 - CONDUCTOR: ");
            System.out.println("2 - OFICIOS GENERALES: ");
            System.out.println("3 - VIGILANCIA: ");
            System.out.println("4 - SALIR: ");
            int opc = Integer.parseInt(input.next());
            switch (opc) {
                case 1:
                    System.out.println("Numero de conductores ");
                    int n = input.nextInt();
                    String nombre[] = new String[n];
                    String SegNombre[] = new String[n];
                    String apellido[] = new String[n];
                    String cargo[] = new String[n];
                    String tipo = "Operativo";

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
                    // llenado de conductores
                    for (int i = 0; i < n; i++) {

                        System.out.println("INGRESE NOMBRE DEL TRABAJADOR: " + (i + 1) + ": ");
                        nombre[i] = input.next();
                        
                        System.out.println("Segundo Nombre: ");
                        SegNombre[i] = input.next();
                        
                        System.out.println("Apellido: ");
                        apellido[i] = input.next();

                        System.out.println("Cargo : ");
                        cargo[i] = input.next();

                        System.out.println("horas trabajadas(MES): ");
                        Htrabajadas[i] = input.nextInt();

                        System.out.println("valor horas trabajadas: ");
                        VhrTrabajadas[i] = input.nextInt();

                        System.out.println("horas extras: ");
                        horasExtras[i] = input.nextInt();

                        System.out.println("valor hora extra: ");
                        valor_horaExtra[i] = input.nextInt();
                    }
                    for (int i = 0; i < n; i++) {
                        if (n > 0) {

                            salarioBruto[i] = Htrabajadas[i] * VhrTrabajadas[i];

                            total_horas_extra[i] = valor_horaExtra[i] * horasExtras[i];

                            salud[i] = ((salarioBruto[i] + total_horas_extra[i])*0.4) * 0.125;

                            pension[i] = ((salarioBruto[i] + total_horas_extra[i])*0.4) * 0.16;

                            arl[i] = ((salarioBruto[i] + total_horas_extra[i])*0.4) * 0.00522;

                            total_prestaciones[i] = (salud[i] + pension[i]) + arl[i];

                            total_pagar[i] = (salarioBruto[i] + total_horas_extra[i]) - total_prestaciones[i];

                            System.out.println("*******************************************");
                            System.out.println("*************VOLANTE DE PAGO***************");
                            System.out.println("*******************************************");
                            System.out.println("NOMBRE: " + nombre[i]+"\t"+SegNombre[i]+"\t"+apellido[i]);
                            System.out.println("CARGO: " + cargo[i]);
                            System.out.println("HORAS TRABAJADAS: " + Htrabajadas[i]);
                            System.out.println("SALARIO BURUTO: $" + salarioBruto[i]);
                            System.out.println("HORAS EXTRAS: " + horasExtras[i]);
                            System.out.println("TOTAL PAGO HORAS EXTRAS: $" + total_horas_extra[i]);

                            System.out.println("");

                            System.out.println("*********************************************");
                            System.out.println("*************DESCUENTOS DE LEY***************");
                            System.out.println("*********************************************");

                            System.out.println("");

                            System.out.println("SALUD(4%): $" + f.format(salud[i]));
                            System.out.println("PENSION(4%): $" + f.format(pension[i]));
                            System.out.println("ARL(0.0522%): $" + arl[i]);

                            System.out.println("");

                            System.out.println("TOTAL DESCUENTO: $" + f.format(total_prestaciones[i]));
                            System.out.println("TOTAL A PAGAR: $" + f.format(total_pagar[i]));

                            System.out.println("");

                            System.out.println("************************************************");
                            System.out.println("*************FIN VOLANTE DE PAGO****************");
                            System.out.println("************************************************");
                        }
                          GuardarConductor(nombre[i]+"\t"+SegNombre[i]+"\t"+apellido[i], tipo, cargo[i], Htrabajadas[i], salarioBruto[i], horasExtras[i], valor_horaExtra[i], salud[i], pension[i], arl[i], total_pagar[i], n - 1);       

                    }

                    break;
                case 2:
                    System.out.println("Numero de Trabajadores de oficios generales: ");
                    int m = input.nextInt();
                    String nombre1[] = new String[m];
                    String SegNombre1[] = new String[m];
                    String apellido1[] = new String[m];
                    String cargo1[] = new String[m];
                    String tipo1 = "Operativo";

                    int VhrTrabajadas1[] = new int[m];
                    int Htrabajadas1[] = new int[m];
                    int salarioBruto1[] = new int[m];
                    int horasExtras1[] = new int[m];
                    int valor_horaExtra1[] = new int[m];
                    int total_horas_extra1[] = new int[m];

                    double salud1[] = new double[m];
                    double pension1[] = new double[m];
                    double arl1[] = new double[m];
                    double total_prestaciones1[] = new double[m];
                    double total_pagar1[] = new double[m];
                    // llenado de Trabajadores de oficios generales
                    for (int i = 0; i < m; i++) {

                        System.out.println("INGRESE NOMBRE DEL TRABAJADOR: " + (i + 1) + ": ");
                        nombre1[i] = input.next();
                        
                        System.out.println("Segundo Nombre: ");
                        SegNombre1[i] = input.next();
                        
                        System.out.println("Apellido: ");
                        apellido1[i] = input.next();

                        System.out.println("Cargo: ");
                        cargo1[i] = input.next();

                        System.out.println("horas trabajadas(MES): ");
                        Htrabajadas1[i] = input.nextInt();

                        System.out.println("valor horas trabajadas: ");
                        VhrTrabajadas1[i] = input.nextInt();

                        System.out.println("horas extras: ");
                        horasExtras1[i] = input.nextInt();

                        System.out.println("valor hora extra: ");
                        valor_horaExtra1[i] = input.nextInt();
                    }
                    for (int i = 0; i < m; i++) {
                        if (m > 0) {

                            salarioBruto1[i] = Htrabajadas1[i] * VhrTrabajadas1[i];

                            total_horas_extra1[i] = valor_horaExtra1[i] * horasExtras1[i];

                            salud1[i] = ((salarioBruto1[i] + total_horas_extra1[i])*0.4) * 0.125;

                            pension1[i] = ((salarioBruto1[i] + total_horas_extra1[i])*0.4) * 0.16;

                            arl1[i] = ((salarioBruto1[i] + total_horas_extra1[i])*0.4) * 0.01044;

                            total_prestaciones1[i] = (salud1[i] + pension1[i]) + arl1[i];

                            total_pagar1[i] = (salarioBruto1[i] + total_horas_extra1[i]) - total_prestaciones1[i];

                            System.out.println("*******************************************");
                            System.out.println("*************VOLANTE DE PAGO***************");
                            System.out.println("*******************************************");
                            System.out.println("NOMBRE: " + nombre1[i]+"\t"+SegNombre1[i]+"\t"+apellido1[i]);
                            System.out.println("CARGO; " + cargo1[i]);
                            System.out.println("HORAS TRABAJADAS: " + Htrabajadas1[i]);
                            System.out.println("SALARIO BURUTO: $" + salarioBruto1[i]);
                            System.out.println("HORAS EXTRAS: " + horasExtras1[i]);
                            System.out.println("TOTAL PAGO HORAS EXTRAS: $" + total_horas_extra1[i]);

                            System.out.println("");

                            System.out.println("*********************************************");
                            System.out.println("*************DESCUENTOS DE LEY***************");
                            System.out.println("*********************************************");

                            System.out.println("");

                            System.out.println("SALUD(4%): $" + f.format(salud1[i]));
                            System.out.println("PENSION(4%): $" + f.format(pension1[i]));
                            System.out.println("ARL(0.0522%): $" + arl1[i]);

                            System.out.println("");

                            System.out.println("TOTAL DESCUENTO: $" + f.format(total_prestaciones1[i]));
                            System.out.println("TOTAL A PAGAR: $" + f.format(total_pagar1[i]));

                            System.out.println("");

                            System.out.println("************************************************");
                            System.out.println("*************FIN VOLANTE DE PAGO****************");
                            System.out.println("************************************************");
                        }
                            GuardarEmpleServ(nombre1[i]+"\t"+SegNombre1[i]+"\t"+apellido1[i], tipo1, cargo1[i], Htrabajadas1[i], salarioBruto1[i], horasExtras1[i], valor_horaExtra1[i], salud1[i], pension1[i], arl1[i], total_pagar1[i], m - 1);       

                    }

                    break;
                case 3:
                    System.out.println("Numero de Vigilantes: ");
                    int o = input.nextInt();
                    String nombre2[] = new String[o];
                    String SegNombre2[] = new String[o];
                    String apellido2[] = new String[o];

                    String cargo2[] = new String[o];
                    String tipo2 = "Operativo";

                    int VhrTrabajadas2[] = new int[o];
                    int Htrabajadas2[] = new int[o];
                    int salarioBruto2[] = new int[o];
                    int horasExtras2[] = new int[o];
                    int valor_horaExtra2[] = new int[o];
                    int total_horas_extra2[] = new int[o];

                    double salud2[] = new double[o];
                    double pension2[] = new double[o];
                    double arl2[] = new double[o];
                    double total_prestaciones2[] = new double[o];
                    double total_pagar2[] = new double[o];
                    // llenado de vigilantes
                    for (int i = 0; i < o; i++) {

                        System.out.println("INGRESE NOMBRE DEL TRABAJADOR: " + (i + 1) + ": ");
                        nombre2[i] = input.next();
                        
                        System.out.println("Segundo Nombre: ");
                        SegNombre2[i] = input.next();
                        
                        System.out.println("Apellido: ");
                        apellido2[i] = input.next();

                        System.out.println("Cargo: ");
                        cargo2[i] = input.next();

                        System.out.println("horas trabajadas(MES): ");
                        Htrabajadas2[i] = input.nextInt();

                        System.out.println("valor horas trabajadas: ");
                        VhrTrabajadas2[i] = input.nextInt();

                        System.out.println("horas extras: ");
                        horasExtras2[i] = input.nextInt();

                        System.out.println("valor hora extra: ");
                        valor_horaExtra2[i] = input.nextInt();
                    }
                    for (int i = 0; i < o; i++) {
                        if (o > 0) {

                            salarioBruto2[i] = Htrabajadas2[i] * VhrTrabajadas2[i];

                            total_horas_extra2[i] = valor_horaExtra2[i] * horasExtras2[i];

                            salud2[i] = ((salarioBruto2[i] + total_horas_extra2[i])*0.4) * 0.125;

                            pension2[i] = ((salarioBruto2[i] + total_horas_extra2[i])* 0.4) * 0.16;

                            arl2[i] = ((salarioBruto2[i] + total_horas_extra2[i])*0.4) * 0.0435;

                            total_prestaciones2[i] = (salud2[i] + pension2[i]) + arl2[i];

                            total_pagar2[i] = (salarioBruto2[i] + total_horas_extra2[i]) - total_prestaciones2[i];

                            System.out.println("*******************************************");
                            System.out.println("*************VOLANTE DE PAGO***************");
                            System.out.println("*******************************************");
                            System.out.println("NOMBRE: " + nombre2[i]+"\t"+SegNombre2[i]+"\t"+apellido2[i]);
                            System.out.println("CARGO; " + cargo2[i]);
                            System.out.println("HORAS TRABAJADAS: " + Htrabajadas2[i]);
                            System.out.println("SALARIO BURUTO: $" + salarioBruto2[i]);
                            System.out.println("HORAS EXTRAS: " + horasExtras2[i]);
                            System.out.println("TOTAL PAGO HORAS EXTRAS: $" + total_horas_extra2[i]);

                            System.out.println("");

                            System.out.println("*********************************************");
                            System.out.println("*************DESCUENTOS DE LEY***************");
                            System.out.println("*********************************************");

                            System.out.println("");

                            System.out.println("SALUD(4%): $" + f.format(salud2[i]));
                            System.out.println("PENSION(4%): $" + f.format(pension2[i]));
                            System.out.println("ARL(0.0522%): $" + arl2[i]);

                            System.out.println("");

                            System.out.println("TOTAL DESCUENTO: $" + f.format(total_prestaciones2[i]));
                            System.out.println("TOTAL A PAGAR: $" + f.format(total_pagar2[i]));

                            System.out.println("");

                            System.out.println("************************************************");
                            System.out.println("*************FIN VOLANTE DE PAGO****************");
                            System.out.println("************************************************");
                        }
                            GuardarVigilante(nombre2[i]+"\t"+SegNombre2[i]+"\t"+apellido2[i], tipo2, cargo2[i], Htrabajadas2[i], salarioBruto2[i], horasExtras2[i], valor_horaExtra2[i], salud2[i], pension2[i], arl2[i], total_pagar2[i], o - 1);       

                    }

                    break;
                case 4:
                    System.out.println("FiN");
                default:
                    System.out.println("Vuelva a intentarlo!");
            }
            
        } while (continuar == true);
    }

    public static void MenuAdministrativos() {

        System.out.println("Numero de administrativos: ");
        int n = input.nextInt();
        String nombre[] = new String[n];
        String SegNombre[] = new String[n];
        String apellido[] = new String[n];

        String cargo[] = new String[n];
        String tipo = "ADMINISTRATIVO";

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
        // llenado de Trabajadores administrativos
        for (int i = 0; i < n; i++) {

            System.out.println("INGRESE NOMBRE DEL TRABAJADOR: " + (i + 1) + ": ");
            nombre[i] = input.next();
            
            System.out.println("Segundo Nombre: ");
            SegNombre[i] = input.next();
                        
            System.out.println("Apellido: ");
            apellido[i] = input.next();

            System.out.println("Cargo administrativo: ");
            cargo[i] = input.next();

            System.out.println("horas trabajadas(MES): ");
            Htrabajadas[i] = input.nextInt();

            System.out.println("valor horas trabajadas: ");
            VhrTrabajadas[i] = input.nextInt();

            System.out.println("horas extras: ");
            horasExtras[i] = input.nextInt();

            System.out.println("valor hora extra: ");
            valor_horaExtra[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (n > 0) {

                salarioBruto[i] = Htrabajadas[i] * VhrTrabajadas[i];

                total_horas_extra[i] = valor_horaExtra[i] * horasExtras[i];

                salud[i] = (salarioBruto[i] + total_horas_extra[i]) * 0.04;

                pension[i] = (salarioBruto[i] + total_horas_extra[i]) * 0.04;

                arl[i] = (salarioBruto[i] + total_horas_extra[i]) * 0.00522;

                total_prestaciones[i] = (salud[i] + pension[i]) + arl[i];

                total_pagar[i] = (salarioBruto[i] + total_horas_extra[i]) - total_prestaciones[i];

                System.out.println("*******************************************");
                System.out.println("*************VOLANTE DE PAGO***************");
                System.out.println("*******************************************");
                System.out.println("NOMBRE: " + nombre[i]+"\t"+SegNombre[i]+"\t"+apellido[i]);
                System.out.println("CARGO: " + cargo[i]);
                System.out.println("HORAS TRABAJADAS: " + Htrabajadas[i]);
                System.out.println("SALARIO BURUTO: $" + salarioBruto[i]);
                System.out.println("HORAS EXTRAS: " + horasExtras[i]);
                System.out.println("TOTAL PAGO HORAS EXTRAS: $" + total_horas_extra[i]);

                System.out.println("");

                System.out.println("*********************************************");
                System.out.println("*************DESCUENTOS DE LEY***************");
                System.out.println("*********************************************");

                System.out.println("");

                System.out.println("SALUD(4%): $" + f.format(salud[i]));
                System.out.println("PENSION(4%): $" + f.format(pension[i]));
                System.out.println("ARL(0.0522%): $" + arl[i]);

                System.out.println("");

                System.out.println("TOTAL DESCUENTO: $" + f.format(total_prestaciones[i]));
                System.out.println("TOTAL A PAGAR: $" + f.format(total_pagar[i]));

                System.out.println("");

                System.out.println("************************************************");
                System.out.println("*************FIN VOLANTE DE PAGO****************");
                System.out.println("************************************************");
            }
            /**
            * Diego
             * Guardar Persona cada que creamos un emepleado administrador
            * */
            GuardarAdmin(nombre[i]+"\t"+SegNombre[i]+"\t"+apellido[i], tipo, cargo[i], Htrabajadas[i], salarioBruto[i], horasExtras[i], valor_horaExtra[i], salud[i], pension[i], arl[i], total_pagar[i], n - 1);       
        }

    }
    public static void GuardarAdmin(String nombres, String tipo, String cargo, int horasTra, int salario, int horasExt, int salarioExtr, double salud, double pension, double arl, double Total, int N) {
        File ficheros;
        FileWriter escribir;
        try {
            if (bandera == N && N > 0) {//para poder cerrar archivo cuando bandera==100(cuando hayamos terminado de crar los administradores)
                bandera = 100;
            }
            switch (bandera) {
                case 0:
                    ficheros = new File("nomina.txt");// extension .txt
                    escribir = new FileWriter(ficheros);
                    parrafo = new BufferedWriter(escribir);
                    parrafo.write("    Nombre             |      Tipo    |       Cargo       |    HT    |    Salario    |   HE  |    TPHE   |   Salud   |   Pensión    |    ARL     |   Total a Pagar");
                    parrafo.newLine();//para no sobreescribir
                    parrafo.write(nombres + "\t" + tipo + "\t" + cargo + "\t\t" + horasTra + "\t" +  salario + "\t\t" + horasExt + "\t" + salarioExtr + "\t\t" + salud + "\t" + pension + "\t" + arl + "\t" + "\t" + Total);
                    bandera++;
                    if (N == 0) {//para cerrar archivo cuando sea un solo administrador
                        parrafo.close();//importante cerrar despues de escribir
                        bandera=0;
                    }
                    break;
                case 100:
                    parrafo.newLine();
                    parrafo.write(nombres + "\t" + tipo + "\t" + cargo + "\t\t" +   horasTra + "\t" +     salario + "\t" +   horasExt + "\t" + salarioExtr + "\t" + salud + "\t" + pension + "\t" + arl + "\t" + "\t" + Total);
                    parrafo.close();//importante cerrar despues de escribir
                    bandera = 0;
                    break;
                default:
                    parrafo.newLine();
                    parrafo.write(nombres + "\t\t\t\t" + tipo + "\t\t" + cargo + "\t\t\t" + horasTra + "\t" + salario + "\t" + horasExt + "\t" + salarioExtr + "\t" + salud + "\t" + pension + "\t" + arl + "\t" + "\t" + Total);
                    bandera++;
                    break;
            }
        } catch (IOException e) {
            System.out.println("Se presento un error sobreescribiendo el archivo");
        }

    }
    public static void GuardarConductor(String nombres, String tipo, String cargo, int horasTra, int salario, int horasExt, int salarioExtr, double salud, double pension, double arl, double Total, int N) {
        File ficheros;
        FileWriter escribir;
        try {
            if (bandera == N && N > 0) {//para poder cerrar archivo cuando bandera==100(cuando hayamos terminado de crar los administradores)
                bandera = 100;
            }
            switch (bandera) {
                case 0:
                    ficheros = new File("nomina.txt");// extension .txt
                    escribir = new FileWriter(ficheros);
                    parrafo = new BufferedWriter(escribir);
                    parrafo.write("    Nombre             |      Tipo    |       Cargo    |    HT    |    Salario    |   HE  |    TPHE   |   Salud   |   Pensión    |    ARL     |   Total a Pagar");
                    parrafo.newLine();//para no sobreescribir
                    parrafo.write(nombres + "\t" + tipo + "\t" + cargo + "\t" + horasTra + "\t" + salario + "\t" + horasExt + "\t" + salarioExtr + "\t" + salud + "\t" + pension + "\t" + arl + "\t" + "\t" + Total);
                    bandera++;
                    if (N == 0) {//para cerrar archivo cuando sea un solo administrador
                        parrafo.close();//importante cerrar despues de escribir
                        bandera=0;
                    }
                    break;
                case 100:
                    parrafo.newLine();
                    parrafo.write(nombres + "\t" + tipo + "\t" + cargo + "\t\t" +   horasTra + "\t" +     salario + "\t" +    horasExt + "\t" +   salarioExtr + "\t" +   salud + "\t" +    pension + "\t" +   arl + "\t" + "\t" + Total);
                    parrafo.close();//importante cerrar despues de escribir
                    bandera = 0;
                    break;
                default:
                    parrafo.newLine();
                    parrafo.write(nombres + "\t\t\t\t" + tipo + "\t\t" + cargo + "\t\t\t" +  horasTra + "\t" +  salario + "\t" +  horasExt + "\t" +  salarioExtr + "\t" + salud + "\t" + pension + "\t" + arl + "\t" + "\t" + Total);
                    bandera++;
                    break;
            }
        } catch (IOException e) {
            System.out.println("Se presento un error sobreescribiendo el archivo");
        }

    }
    public static void GuardarEmpleServ(String nombres, String tipo, String cargo, int horasTra, int salario, int horasExt, int salarioExtr, double salud, double pension, double arl, double Total, int N) {
        File ficheros;
        FileWriter escribir;
        try {
            if (bandera == N && N > 0) {//para poder cerrar archivo cuando bandera==100(cuando hayamos terminado de crar los administradores)
                bandera = 100;
            }
            switch (bandera) {
                case 0:
                    ficheros = new File("nomina.txt");// extension .txt
                    escribir = new FileWriter(ficheros);
                    parrafo = new BufferedWriter(escribir);
                    parrafo.write("    Nombre             |      Tipo    |       Cargo       |    HT    |    Salario    |   HE  |    TPHE   |   Salud   |   Pensión    |    ARL     |   Total a Pagar");
                    parrafo.newLine();//para no sobreescribir
                    parrafo.write(nombres + "\t" + tipo + "\t" + cargo + "\t\t" + horasTra + "\t" +  salario + "\t\t" + horasExt + "\t" + salarioExtr + "\t\t" + salud + "\t" + pension + "\t" + arl + "\t" + "\t" + Total);
                    bandera++;
                    if (N == 0) {//para cerrar archivo cuando sea un solo administrador
                        parrafo.close();//importante cerrar despues de escribir
                        bandera=0;
                    }
                    break;
                case 100:
                    parrafo.newLine();
                    parrafo.write(nombres + "\t" + tipo + "\t" + cargo + "\t\t" +   horasTra + "\t" +     salario + "\t" +   horasExt + "\t" + salarioExtr + "\t" + salud + "\t" + pension + "\t" + arl + "\t" + "\t" + Total);
                    parrafo.close();//importante cerrar despues de escribir
                    bandera = 0;
                    break;
                default:
                    parrafo.newLine();
                    parrafo.write(nombres + "\t\t\t\t" + tipo + "\t\t" + cargo + "\t\t\t" + horasTra + "\t" + salario + "\t" + horasExt + "\t" + salarioExtr + "\t" + salud + "\t" + pension + "\t" + arl + "\t" + "\t" + Total);
                    bandera++;
                    break;
            }
        } catch (IOException e) {
            System.out.println("Se presento un error sobreescribiendo el archivo");
        }

    }
    public static void GuardarVigilante(String nombres, String tipo, String cargo, int horasTra, int salario, int horasExt, int salarioExtr, double salud, double pension, double arl, double Total, int N) {
        File ficheros;
        FileWriter escribir;
        try {
            if (bandera == N && N > 0) {//para poder cerrar archivo cuando bandera==100(cuando hayamos terminado de crar los administradores)
                bandera = 100;
            }
            switch (bandera) {
                case 0:
                    ficheros = new File("nomina.txt");// extension .txt
                    escribir = new FileWriter(ficheros);
                    parrafo = new BufferedWriter(escribir);
                    parrafo.write("    Nombre             |      Tipo    |       Cargo       |    HT    |    Salario    |   HE  |    TPHE   |   Salud   |   Pensión    |    ARL     |   Total a Pagar");
                    parrafo.newLine();//para no sobreescribir
                    parrafo.write(nombres + "\t" + tipo + "\t" + cargo + "\t\t" + horasTra + "\t" +  salario + "\t\t" + horasExt + "\t" + salarioExtr + "\t\t" + salud + "\t" + pension + "\t" + arl + "\t" + "\t" + Total);
                    bandera++;
                    if (N == 0) {//para cerrar archivo cuando sea un solo administrador
                        parrafo.close();//importante cerrar despues de escribir
                        bandera=0;
                    }
                    break;
                case 100:
                    parrafo.newLine();
                    parrafo.write(nombres + "\t" + tipo + "\t" + cargo + "\t\t" +   horasTra + "\t" +     salario + "\t" +   horasExt + "\t" + salarioExtr + "\t" + salud + "\t" + pension + "\t" + arl + "\t" + "\t" + Total);
                    parrafo.close();//importante cerrar despues de escribir
                    bandera = 0;
                    break;
                default:
                    parrafo.newLine();
                    parrafo.write(nombres + "\t\t\t\t" + tipo + "\t\t" + cargo + "\t\t\t" + horasTra + "\t" + salario + "\t" + horasExt + "\t" + salarioExtr + "\t" + salud + "\t" + pension + "\t" + arl + "\t" + "\t" + Total);
                    bandera++;
                    break;
            }
        } catch (IOException e) {
            System.out.println("Se presento un error sobreescribiendo el archivo");
        }

    }
}