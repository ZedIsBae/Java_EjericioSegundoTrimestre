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
    int[]  listaNumeros	={-1,-1,-3,-4,-5,};   
   
    /*
    El metodo maximos va a calcular el maximo y el segundo maximo de una lista de numeros
    */
    private int[] maximos (int[] lista){
        //declaramos un array de dos elementos para guardar el maximo y el segundo maximo
        //lenght devuelve el numero de elementos que contiene ese array
        int[] listaMaximos = {lista [0],lista [1]};
        for (int i=1; i< lista.length; i++){
            if(listaMaximos[0] <= lista[i]){  
                // Si llega aqui es que el numero que estoy comparando es mayor o igual 
                // que el que tengo en lalista de maximo
             //  if(i!=0){
                listaMaximos[1] = listaMaximos[0]; // desplazo derecha el que habia como maximo
             //  }
                listaMaximos[0] = lista[i]; //Pongo en la primera posición al nuevo maximo
                
            }
            else if  (lista[i]>=listaMaximos[1]){ //compruebo sí el número que estoy leyedo es mayor que el número de la lista de maximos
                listaMaximos[1] = lista[i];  // pongo en la segunda posición al nuevo segundo maximo
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
