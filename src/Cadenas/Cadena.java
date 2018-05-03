/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadenas;

/**
 *
 * @author alumno
 */
public class Cadena {
    private int cont;
    private String cadenaInvertida;
    //los metodos devuelven un valor dependiendo del tipo
    //o tambien pueden ser de tipo void¨(no devuelve nada: realiza acciones a dentro del metodo)
    public void CantidadDeVocales (String cadena) {
        setCont(0);
        int longitud = cadena.length();
        for (int x=0; x<longitud; x++) {
            if (cadena.charAt(x)== 'a' || cadena.charAt (x)== 'e' || cadena.charAt(x)=='i' || cadena.charAt(x)== 'o' || cadena.charAt(x)=='u')            {
                setCont(getCont () +1);
                
            }  
        }
        System.out.println("La cantidad de vocales que posee la cadena son: " + getCont ());
        
        
    }
    public void InvertirCadena (String cadena) {
        setCadenaInvertida("");
        for (int i = cadena.length() -1; i>= 0; i--){
            setCadenaInvertida(getCadenaInvertida()+ cadena.charAt(i));    
        }
        System.out.println("La cadena invertida es: "+ getCadenaInvertida());
    }
    public void VerificarRepeticion(String cadena,char caracter){
        setCont(0);
        for (int i=0; i< cadena.length(); i++){
            if (cadena.charAt(i)==caracter){
                setCont (getCont()+1);
            }
        }
        System.out.println("El caracter: "+caracter+" se repite: " +getCont());
    }

    /**
     * @return the cont
     */
    public int getCont() {
        return cont;
    }

    /**
     * @param cont the cont to set
     */
    public void setCont(int cont) {
        this.cont = cont;
    }

    /**
     * @return the cadenaInvertida
     */
    public String getCadenaInvertida() {
        return cadenaInvertida;
    }

    /**
     * @param cadenaInvertida the cadenaInvertida to set
     */
    public void setCadenaInvertida(String cadenaInvertida) {
        this.cadenaInvertida = cadenaInvertida;
    }
    
}
