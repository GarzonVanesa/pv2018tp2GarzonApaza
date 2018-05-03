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
    
    private String Dia;
    private String Mes;
    private String Anio;
    
    
    
    
    public int DevolverEdadEnSemanas (Date fecha){ 
        Date fechaActual = new Date ();
        int semana = (int)((fechaActual.getTime() - fecha.getTime()) / 604800000);
        return semana;
    }
    public void ObtenerEstacion (Date fecha){
        int mes = fecha.getMonth() +1;
        int dia = fecha.getDate();
        String estacion="";
        switch (mes) {
            case 1: 
            case 2: 
                    estacion = "verano";
            case 3: if (dia<21){
                estacion = "verano";
            }
            else {
                estacion = "otoño";
            }
            case 4:
            case 5: estacion = "otoño";
            case 6: if(dia< 21){
                estacion = "otoño";
            }
            else{
                estacion = "invierno";
            }
            case 7:
            case 8:
                estacion = "invierno";
            case 9: 
                if(dia < 21 ){
                    estacion = "invierno";
                }else{
                    estacion = "primavera";
                }
            case 10:
            case 11:
                estacion  = "primavera";
            case 12: if (dia < 21 ){
                estacion = "primavera";
            }    else{
                estacion = "verano";
            }
        }
        System.out.println("La estacion es" + estacion );
    }
    public void MostrarDomingos (Date fechaInicial, Date fechaFinal){
           
        int domingos = 0;
        int nrodia = 1;  //1 domingo 2 lunes 
        int diferencia = DevolverDiferenciaDias(fechaInicial, fechaFinal);
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(fechaInicial);
        for (int i = 1; i <= diferencia; i++) {
            int dia = cal.get(Calendar.DAY_OF_WEEK);
            if (dia == 1) {
                domingos++;
            }
            cal.add(Calendar.DAY_OF_YEAR, 1);
        }

        System.out.println("total de domingos:  " + domingos);
    }
    public int DevolverDiferenciaDias (Date fechaInicial, Date fechaFinal){
        int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
	return dias;
    }
    
    public String getDia() {
        return Dia;
    }

    /**
     * @param Dia the Dia to set
     */
    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    /**
     * @return the Mes
     */
    public String getMes() {
        return Mes;
    }

    /**
     * @param Mes the Mes to set
     */
    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    /**
     * @return the Anio
     */
    public String getAnio() {
        return Anio;
    }

    /**
     * @param Anio the Anio to set
     */
    public void setAnio(String Anio) {
        this.Anio = Anio;
    }

}
