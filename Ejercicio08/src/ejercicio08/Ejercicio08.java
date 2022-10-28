/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio08;

/**
 *
 * @author UTPL
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 10;
        int num2 = 9;
        int num3 = 20;
        int num4 = 500;
        int num5 = 2;
        int num6 = 3;
        int num7 = 200;
        int num8 = 50;
        int num9 = 51;
        double resultado;
        boolean respuesta;

        resultado = (num1*num2)+num3-num4/num5+Math.pow(num3, num5);
        respuesta = (resultado >= num7) || (num8 >= (num8-num8+num9));
        System.out.println(respuesta);
    }

}
