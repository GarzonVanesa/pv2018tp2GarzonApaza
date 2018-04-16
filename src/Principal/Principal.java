
package Principal;

import Fechas.Fecha;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Principal {
    public static void main(String[] args ){
        try {
            Date fechaInicial = null;
            
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            String fechaux = "01/04/2018";
            fechaInicial = df.parse(fechaux);
            Date fechaFinal = new Date();
            Fecha d = new Fecha();
            d.DevolverDiferencaDias(fechaInicial, fechaFinal);
        } catch (ParseException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String invertida;
    public static void menu () {
        System.out.println ( "1: Punto 1");
        System.out.println ( "2: Punto 2");
        System.out.println ( "3: Punto 3");
        System.out.println ( "4: Punto 3");
        System.out.println ( "5: Punto 3");
        System.out.println ( "6: Punto 3");
        
    }
    public void InvertirCadena(String cadena){
      
               
        for(int i =cadena.length(); i>= 0  ; i++){
            this.invertida += cadena.charAt(i);
        }
        
        System.out.println(invertida);
    }
}
