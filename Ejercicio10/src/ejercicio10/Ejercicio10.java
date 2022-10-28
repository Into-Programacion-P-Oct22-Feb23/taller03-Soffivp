/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author UTPL
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 25;
        int num2 = 100;
        int num3 = 10;
        int num4 = 5;
        int num5 = 2;

        double resultado;
        boolean respuesta;
        boolean t = true;
        boolean f = false;

        resultado = Math.sqrt(25) * 10;
        respuesta = (resultado >= num2) && (t)||(f)||(num3/num4 >=num5);
        System.out.println(respuesta);
    }

}
