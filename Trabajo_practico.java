/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package unsada.diplomatura.trabajo_practico;
import java.util.Scanner;


/**
 *
 * @author juani
 */
public class Trabajo_practico {
    /*1. Crear un programa que lea desde teclado una secuencia de números enteros. 
La lectura finaliza cuando se lee el número 0 (cero). Informar para cada 
número la suma de sus dígitos pares. */
    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

    
        int numero;
        int copia;           
        int digito;           
        int sumaDePares;      

        System.out.println("Ingresa un numero (0 para terminar):");
        numero = sc.nextInt();

        while (numero != 0) {

            sumaDePares = 0;
            if (numero < 0) {
                copia = numero * -1;
            } else {
                copia = numero;
            }
            while (copia != 0) {
                digito = copia % 10;        
                if (digito % 2 == 0) { 
                    sumaDePares = sumaDePares + digito;
                }
                copia = copia / 10;
            }

            
            System.out.println("La suma de los dígitos pares es: " + sumaDePares);
            System.out.println("Ingresá otro número (0 para terminar):");
            numero = sc.nextInt();
        }

  
        System.out.println("Fin del programa.");
    }
}


