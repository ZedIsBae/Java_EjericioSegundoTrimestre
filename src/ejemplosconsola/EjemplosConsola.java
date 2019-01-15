/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;

import java.util.Arrays;
/**
 *
 * @author Jon
 */
public class EjemplosConsola {
        //declaro un array de int´s de instancia
    int[]  listaNumeros	={200,31,17,2,5,99};   
    /*
    El metodo maximos va a calcular el maximo y el segundo maximo de una lista de numeros
    */
    private int[] maximos (int[] lista){
        //declaramos un array de dos elementos para guardar el maximo y el segundo maximo
        //lenght devuelve el numero de elementos que contiene ese array
        int[] listaMaximos = {lista [0],lista [0]};
        for (int i=0; i< lista.length; i++){
            if(listaMaximos[0] < lista[i]){
                listaMaximos[1] = listaMaximos[0];
                listaMaximos[0] = lista[i];
             }
        }
       
         
        
        
        return listaMaximos;
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemplosConsola ejericicios = new EjemplosConsola();
        System.out.println( ejericicios.listaNumeros[2]);
        System.out.println(Arrays.toString( ejericicios.maximos(ejericicios.listaNumeros)));
        //declaro un array de int´s de instancia
 /*si quisiese ponerlo dentro neceistaria lo siguiente:
            int[]  listaNumeros	={50,31,27,2,5,99};
            System.out.println( listaNumeros[2]);
*/
        ejericicios.maximos(ejericicios.listaNumeros);   
   } 
}
