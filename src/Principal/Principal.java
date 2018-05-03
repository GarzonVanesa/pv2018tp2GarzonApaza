package Principal;

import Fechas.Fecha;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try {
            Scanner teclas = new Scanner(System.in);
            char caracter;
            String cadena;
            Date FechaIngresada;
            Date FechaFinal;
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Ingrese una fecha con el formato DD/MM/YYYY");
            String fechaIn = teclas.next();

            System.out.println("Ingrese una fecha final con el formato DD/MM/YYYY");
            String fechaFinal = teclas.next();

            FechaIngresada = df.parse(fechaIn);//Convierte en una fecha valida
            FechaFinal = df.parse(fechaFinal);
            Fecha fa = new Fecha();
            fa.ObtenerEstacion(FechaIngresada);
            fa.MostrarDomingos(FechaIngresada, FechaFinal);
            System.out.println("La edad en semanas es: " + fa.DevolverEdadEnSemanas(FechaIngresada));
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca día, mes y año: ");
            int dia = sc.nextInt();
            int mes = sc.nextInt();
            int year = sc.nextInt();
            GregorianCalendar fechad = new GregorianCalendar(year, mes - 1, dia);
            fechad.add(Calendar.DATE, 100);
            Date fechaDate = fechad.getTime();
            SimpleDateFormat formato = new SimpleDateFormat("EEEE, d 'de' MMMM 'de' yyyy");
            System.out.println("La fecha despues de 100 dias es: " + formato.format(fechaDate));

            /*Cadena cad = new Cadena();
            System.out.println("Ingrese un caracter");
            caracter=teclas.next().charAt(0);
            System.out.println("ingrese una palabra");
            cadena = teclas.next();*/
            //cad.CantidadDeVocales(teclas.next());
            //cad.InvertirCadena (teclas.next ());
            //cad.VerificarRepeticion(cadena, caracter);
            //menu();
        } catch (ParseException ex) {

        }
    }
    public String invertida;

    public static void menu() {
        System.out.println("1: Punto 1");
        System.out.println("2: Punto 2");
        System.out.println("3: Punto 3");
        System.out.println("4: Punto 3");
        System.out.println("5: Punto 3");
        System.out.println("6: Punto 3");

    }

    public void InvertirCadena(String cadena) {

        for (int i = cadena.length(); i >= 0; i++) {
            this.invertida += cadena.charAt(i);
        }

        System.out.println(invertida);
    }
}
