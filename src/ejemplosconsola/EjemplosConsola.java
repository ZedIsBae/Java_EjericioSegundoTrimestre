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
    
        private boolean palindromo(String cadena){
          //primera fase: creo nuevo string que sea una copia de la anterior pero quitandole los espacios en blanco
          String auxiliar = "";
          for (int i=0; i< cadena.length();i++){
              if (cadena.charAt(i) !=' '){
                  auxiliar = auxiliar + cadena.charAt(i);
          }
          }
          //ahora en auxiliar tengo el string pero sin espacios en blanco
          //declaro dos indices para que digan que posiciones estoy comparando
          int indiceIzq = 0;
          int indiceDer = auxiliar.length()-1;
          //mientras sean iguales los caracteres en esa posiciones la palabra sera un palindromo
          //en el momento en el que una de esas comparaciones falte, es que no es palindromo
          
          //ademas, si el izquierdo es mayor que el derecho, ya he chequeado toda la frase
          while (auxiliar.charAt(indiceIzq)== auxiliar.charAt(indiceDer)&& indiceIzq<=indiceDer){
              indiceIzq++;
              indiceDer--;
          }
          boolean esPalindromo = true;
          if(indiceIzq < indiceDer){ // Si esto se cumple es que la palabra no es un palindromo
              esPalindromo = false;
              System.out.println("No es Un Palindromo");
          }
          else{
               System.out.println("Si es un palindromo");
          }
            return esPalindromo; 
        }
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemplosConsola ejericicios = new EjemplosConsola();
        System.out.println( ejericicios.listaNumeros[2]);
        System.out.println(Arrays.toString( ejericicios.maximos(ejericicios.listaNumeros)));
        System.out.println( ejericicios.palindromo("ACASO HUBO BUHOS ACA"));
        System.out.println( ejericicios.palindromo("wadhnawkjdka dwad dad"));
        System.out.println( ejericicios.palindromo("TACOCAT"));
        //declaro un array de int´s de instancia
 /*si quisiese ponerlo dentro neceistaria lo siguiente:
            int[]  listaNumeros	={50,31,27,2,5,99};
            System.out.println( listaNumeros[2]);
*/
        ejericicios.maximos(ejericicios.listaNumeros);   
   }     
}
