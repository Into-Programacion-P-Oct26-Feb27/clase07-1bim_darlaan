/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

/**
 *
 * @author SALASC
 */
public class Ejemplo15 {
   
    public static void main(String[] args) {
        
        int contador = 1;
        int limite = 1;
        while (contador < limite){
            System.out.printf("Valor %d\n", contador);
            
        }
        /*
        Nunca ingresa a ese ciclo porque al ser 1 el contador y 1 el limite
        la condicion dice que si el contador es mayor que el limite tiene que imprimir el valor
        por lo tanto no imprime nada, al leer 1<1 lo toma como falso.
        */
        
}
}