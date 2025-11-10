
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
    
    public void generarFactura(Pedido pedido, Cliente cliente){
        this.monto=pedido.total;
        this.ruc=cliente.ruc;
        this.idPedido=pedido.idPedido;
    }
    
    public void imprimirFactura(){
        System.out.println("=======FACTURA========");
        System.out.println("ID Factura: "+this.idFactura);
        System.out.println("ID Pedido: "+this.idPedido);
        System.out.println("Ruc Cliente: "+this.ruc);
        System.out.println("Metodo de pago: "+this.tipoPago);
        System.out.println("Monto: "+this.monto);
        System.out.println("=======================");
    }
    
}
