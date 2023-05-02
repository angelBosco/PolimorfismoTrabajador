/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismotrabajador;

/**
 *
 * @author admin
 */
public class PolimorfismoTrabajador {
//Asociado en git a https://github.com/angelBosco/PolimorfismoTrabajador.git
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Trabajador trabajador;
        Trabajador empleado;
        Trabajador consultor;

        trabajador = new Trabajador("Bill Gates", "Presidente", "Redmond", "", "");
        empleado = new Empleado("Larry Ellison", "Presidente", "Redwood", "", "", 100000.0, 1000.0);
        consultor = new Consultor("Steve Jobs", "Consultor Jefe", "Cupertino", "", "", 20, 1000.0);

        saludar(trabajador);
        saludar(empleado);
        saludar(consultor);
        imprimirNombreYPaga(trabajador);
        imprimirNombreYPaga(empleado);
        imprimirNombreYPaga(consultor);

    }

    public static void saludar(Trabajador t) {
        System.out.println("Hola, " + t.getNombre());
    }

    public static void imprimirNombreYPaga(Trabajador t) {
        System.out.printf("El trabajador %s tiene una paga de %.2f� %n", t.getNombre(), t.calcularPaga());
    }

}
