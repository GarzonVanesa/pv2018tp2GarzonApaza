/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class Estacion {
    public static void main (String[]args){
        
    }
    public void Estacion(String fecha){
        
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        Date fechaParse = null;
        try {
            fechaParse = df.parse(fecha);
        }catch (ParseException ex){
            ex.printStackTrace();
        }
        Calendar cal =  Calendar.getInstance();
        cal.setTime(fechaParse);
        int mes =  cal.get(Calendar.MONTH) + 1;
        //int dia = cal.get(Calendar.DATE);
        switch(mes){

            case 3:
            case 4:
            case 5:
             System.out.println("Primavera");
            break;

            case 6:
            case 7:
            case 8:
             System.out.println("Verano");
            break;

            case 9:
            case 10:
            case 11:
             System.out.println("Otoño");
            break;

            case 12:
            case 1:
            case 2:
             System.out.println("Invierno");
            break;

            default:
             System.out.println("Mes y estacion no existen");
        }
    }
}
