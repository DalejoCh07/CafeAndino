
package ec.edu.espoch.cafeandino.clases;

import ec.edu.espoch.cafeandino.enumeracion.MetodoPago;

public class Factura {
    //Atributos
    public int idFactura;
    public MetodoPago tipoPago;
    public double monto;
    public String ruc;
    public int idPedido;
    
    //Metodos

    public Factura(MetodoPago tipoPago) {
        this.idFactura = idFactura++;
        this.tipoPago = tipoPago;
    }
    
    public boolean generarFactura(Pedido pedido, Cliente cliente){
        
        return false;
    }
    
}
