
package ec.edu.espoch.cafeandino.clases;

import ec.edu.espoch.cafeandino.enumeracion.EstadoPedido;


public class Pedido {
    //Atributos
    public String idPedido;
    public EstadoPedido estadoPedido;
    public double descuento;
    public String motivoCancelado;
    public double total;
    public String fecha;
    public ItemPedido[] items;
    
    //Metodos

    public Pedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }
    
    public boolean añadirObservacion(String observacion){
        
        return false;
    }
    
    public void cambiarEstado(EstadoPedido nuevoEstado){
        
    }
    
    public boolean cancelar(String motivo){
        
        return false;
    }
    
    public double calcDescuento(double porcentaje){
        return 0;
    }
    
    public double calcTotal(){
        return 0;
    }
    
    public boolean agregarItems(ItemPedido item){
      return false;  
    }
    
    public boolean eliminarItems(ItemPedido item){
        return false;
    }
}
