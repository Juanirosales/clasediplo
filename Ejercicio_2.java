/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unsada.diplomatura.trabajo_practico;

/**
 *
 * @author juani
 */
public class Ejercicio_2 {
    /*2. Crear un programa que imprima los números del 1 al 100: 
a. Si el número es divisible por 3 sustituir el número por fizz 
b. Si el número es divisible por 5 sustituir el número por buzz 
c. Si el número es divisible por 5 y 3 sustituir el número por fizzbuzz */
   public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    
}
