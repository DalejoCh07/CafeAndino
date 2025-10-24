
package ec.edu.espoch.cafeandino.clases;

import ec.edu.espoch.cafeandino.enumeracion.Tallas;

public class Promocion {
    //Atributos
    public int idPromocion;
    public String descripcion;
    public String nombreBebida;
    public Tallas talla;
    public boolean soloUnCliente;
    public double descuento;
    public String fecha;
    
    //Metodos

    public Promocion(int idPromocion, String descripcion, String nombreBebida, Tallas talla, boolean soloUnCliente, double descuento, String fecha) {
        this.idPromocion = idPromocion;
        this.descripcion = descripcion;
        this.nombreBebida = nombreBebida;
        this.talla = talla;
        this.soloUnCliente = soloUnCliente;
        this.descuento = descuento;
        this.fecha = fecha;
    }

    
    
    
    
}
