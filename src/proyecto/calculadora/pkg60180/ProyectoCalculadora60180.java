/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.calculadora.pkg60180;

/**
 *
 * @author RORLe
 */
public class ProyectoCalculadora60180 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.suma(3,2,4);
        calculadora.resta(4);
        calculadora.multiplicacion(2);
        calculadora.suma(5,6);
        calculadora.eliminar();
        calculadora.resultado();
    }   
}
