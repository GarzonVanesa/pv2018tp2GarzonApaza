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
    private int contador;
    private String invertida;
    
    public void ContarVocales(String cadena) {
        setContador(0);
        for (int x = 0; x < cadena.length(); x++) {
            if ((cadena.charAt(x) == 'a') || (cadena.charAt(x) == 'e') || (cadena.charAt(x) == 'i') || (cadena.charAt(x) == 'o') || (cadena.charAt(x) == 'u')) {
                setContador(getContador() + 1);
            }
        }
        System.out.println("vocales son : " + getContador());
    }
    public void InvertirCadena(String cadena){
      
        this.setInvertida("");
               
        for(int i =cadena.length(); i>= 0  ; i++){
            this.setInvertida(this.getInvertida() + cadena.charAt(i));
        }
        
        System.out.println("cadena invertida : " + getInvertida());
    }
    public void ContarRepetidos(String cadena, char caracter){
        setContador(0);
        
        for(int i =cadena.length(); i>= 0  ; i++){
            if(cadena.charAt(i)==caracter)
            {
                setContador(getContador() + 1);
            }
        }
         System.out.println("caracter " + caracter + " se repite: " + getContador());
    }

    /**
     * @return the contador
     */
    public int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }

    /**
     * @return the invertida
     */
    public String getInvertida() {
        return invertida;
    }

    /**
     * @param invertida the invertida to set
     */
    public void setInvertida(String invertida) {
        this.invertida = invertida;
    }
    
}
