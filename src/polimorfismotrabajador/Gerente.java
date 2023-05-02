/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismotrabajador;

/**
 *
 * @author Angel
 */
public class Gerente extends Trabajador {
    private int nObjetivos;
    private double precioObjetivo;

    public Gerente(int nObjetivos, double precioObjetivo, String nombre, String puesto, String direccion, String telefono, String nSS) {
        super(nombre, puesto, direccion, telefono, nSS);
        this.nObjetivos = nObjetivos;
        this.precioObjetivo = precioObjetivo;
    }

    public int getnObjetivos() {
        return nObjetivos;
    }

    public void setnObjetivos(int nObjetivos) {
        this.nObjetivos = nObjetivos;
    }

    public double getPrecioObjetivo() {
        return precioObjetivo;
    }

    public void setPrecioObjetivo(double precioObjetivo) {
        this.precioObjetivo = precioObjetivo;
    }

    @Override
    public double calcularPaga() {
        return super.calcularPaga()+ (nObjetivos*precioObjetivo); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
