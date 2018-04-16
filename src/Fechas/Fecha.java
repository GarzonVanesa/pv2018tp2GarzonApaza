/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechas;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author alumno
 */
public class Fecha {
    private String dia;
    private String mes;
    private String anio;
    private String fecha;

    public Fecha() {
    }
    
    
    public void separarFecha(){
        setDia(getFecha().substring(0, 2));
        setMes(getFecha().substring(3, 5));
        setAnio(getFecha().substring(6, 8));
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }
    
    public static int DevolverEdadEnSemanas(Calendar fechaNac) {
        Calendar fechaActual = Calendar.getInstance();
        int semana  = fechaActual.get(Calendar.WEEK_OF_YEAR) - fechaNac.get(Calendar.WEEK_OF_YEAR);
        return semana;
    }
  
    public static int getDayOfTheWeek(Date d){
	GregorianCalendar cal = new GregorianCalendar();
	cal.setTime(d);
	return cal.get(Calendar.DAY_OF_WEEK);		
    }
    
    public void MostrarCantDomingos(Date fecha1, Date fecha2){
        int domingos = 0; 
        int nrodia = 1;  //1 domingo 2 lunes 
        int diferencia = getDiferencaDias(fecha1, fecha2);
        Date fcurso = fecha1;
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(fecha1);
        for(int i = 1; i<= diferencia  ; i++){
            int dia = cal.get(Calendar.DAY_OF_WEEK);
            if(dia == 1)
            {
                domingos++;
            }
            cal.add(Calendar.DAY_OF_YEAR, 1); 
        }
        
        System.out.println(domingos);
    }
    public void DevolverDiferencaDias(Date fechaInicial, Date fechaFinal){
	int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
	System.out.println("Hay "+dias+" dias de diferencia");
    }
    
    public int getDiferencaDias(Date fechaInicial, Date fechaFinal){
	int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
	return dias;
    }
    public String obtenerEstacion(){
        String estacion = "";
        int mes =0;
        int dia =0;
        mes = Integer.parseInt(getMes());
        dia = Integer.parseInt(getDia());
        switch (mes){
            case 1:
            case 2:
                estacion="verano";
            case 3:
                if (dia <21){
                    estacion="verano";
                } else{
                estacion="otoño";
            }
            case 4:
            case 5:
                estacion="otoño";
            case 6:
                if ( dia < 21){
                    estacion="otoño";
                } else{
                    estacion="invierno";
                }
            case 7:
            case 8:
                estacion="invierno";
            case 9:
                if (dia < 21){
                    estacion="invierno";
                } else{
                    estacion="primavera";
                }
            case 10:
                estacion="primavera";
            
        }
        return estacion;
    } 

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the anio
     */
    public String getAño() {
        return anio;
    }

    /**
     * @param año the anio to set
     */
    public void setAnio(String año) {
        this.anio = año;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
