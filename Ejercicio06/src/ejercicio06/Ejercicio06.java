/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

/**
 *
 * @author UTPL
 */
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 81;
        int num2 = 9;
        int num3 = 3;
        int num4 = 10;
        int num5 = 1;
        double resultado;
        boolean respuesta;
        
        resultado = (Math.sqrt(num1) + num2) / num3;
        respuesta = resultado == num2 && (10>1);
        System.out.println(respuesta);

    }

}
