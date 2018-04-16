
package Principal;

import Fechas.Fecha;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Punto03 {
    public int contador; public static void main(String[] args ){
        try {
            Scanner dato = new Scanner(System.in);
            Fecha fech = new Fecha();
             System.out.println("Ingrese el valor para el dia: ");
            fech.setDia(dato.next());
            System.out.println("Ingrese el valor para el mes: ");
            fech.setMes(dato.next());
            System.out.println("Ingrese el valor para el año: ");
            fech.setAnio(dato.next());
            fech.DevolverDiferencaDias(, fechaFinal);
            
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    
    public void ContarRepetidos(String cadena, char caracter){
        for(int i =cadena.length(); i>= 0  ; i++){
            if(cadena.charAt(i)==caracter)
            {
                contador++;
            }
        }
    }
    public void MostrarFecha(String dia, String mes, String anio){
        
        try {
            SimpleDateFormat f  = new SimpleDateFormat("dd-MM-yy");
            String sFecha = dia +"-"+ mes +"-"+ anio;
            Date fecha = f.parse(sFecha);
            
            Date hoy;
            String result;
            SimpleDateFormat formatter;
            
            formatter = new SimpleDateFormat("EEE d MMM yy", Locale.ROOT);
            hoy = new Date();
            result = formatter.format(hoy);
            
            System.out.println("Resultado: " + result);
            System.out.println(" " + formatter.getDateTimeInstance(formatter.LONG, formatter.LONG).format(hoy));
        } catch (ParseException ex) {
            Logger.getLogger(Punto03.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
