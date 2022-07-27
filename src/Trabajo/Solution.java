/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajo;

import java.util.ArrayList;

/**
 *
 * @author ByTito7
 */
public class Solution {
    
    public static Object [] reporte (ArrayList <Corredor> carrera) {
        
        double suma_tiempo = 0;
        double tiempoMenor = Double.MAX_VALUE;
        double tiempoMayor = Double.MIN_VALUE;
        String nombreCorredorMayorTime = "";
        String nombreCorredorMenorTime = "";
        
        for ( Corredor corredor : carrera){
            if (corredor.getTiempoMeta() < tiempoMenor){
                tiempoMenor = corredor.getTiempoMeta();
                nombreCorredorMenorTime = corredor.getNombreCompleto();
            }
            if(corredor.getTiempoMeta() > tiempoMayor){
                tiempoMayor = corredor.getTiempoMeta();
                nombreCorredorMayorTime = corredor.getNombreCompleto();
            }
            suma_tiempo += corredor.getTiempoMeta();
        }
        
        double promedio = suma_tiempo / carrera.size();
        
        Object[] valores = {promedio, nombreCorredorMenorTime,tiempoMenor, nombreCorredorMayorTime, tiempoMayor};

        return valores;
    }
    
    
}
