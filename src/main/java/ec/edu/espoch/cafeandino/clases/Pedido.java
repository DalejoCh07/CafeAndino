
package ec.edu.espoch.cafeandino.clases;

import ec.edu.espoch.cafeandino.enumeracion.EstadoPedido;


public class Pedido {
    //Atributos
    public int idPedido=0;
    public EstadoPedido estadoPedido;
    public double descuento;
    public String motivoCancelado;
    public double total=0;
    public String fecha;
    public ItemPedido[] items=new ItemPedido[2];
    //public items=new ItemPedido[2];
    //Metodos

    public Pedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
        this.idPedido = this.idPedido+1;
        
    }
    
    public boolean añadirObservacion(String observacion){
        return false;
    }
    
    public boolean cambiarEstado(EstadoPedido nuevoEstado){
        boolean respuesta=true;
        if(nuevoEstado==EstadoPedido.ENTREGADO && this.estadoPedido!=EstadoPedido.LISTO){
            respuesta=false;
        } else{
            this.estadoPedido=nuevoEstado;
        }
        return respuesta;
    }
    
    public boolean cancelar(String motivo){
        boolean respuesta=false;
        if(motivo!=null){
            this.estadoPedido=EstadoPedido.CANCELADO;
            this.motivoCancelado=motivo;
            respuesta=true;
        }
        return respuesta;
    }
    
    public double calcDescuento(double porcentaje){
        double total=0;
        total=calcTotal();
        return this.descuento=total*porcentaje;
    }
    
    public double calcTotal(){
        for(int i=0; i<this.items.length;i++){
            System.out.println("valor del item:"+this.items[0].precio);
            total=total+this.items[i].precio;
            System.out.println("despues"+total);
        }
        return total;
    }
    
    public boolean agregarItems(ItemPedido item){
        // verifiar que existan espacios en el vector
        boolean respuesta=false;
        for(int i=0;i<items.length;i++){
            //SI hay espacion añadir el item y retornar true
            //si no hay retornar false
            if (this.items[i]==null){ 
                this.items[i]=item;
                respuesta=true;
                break;
            }
        }
      return respuesta;  
    }
    
    public boolean eliminarItems(ItemPedido elimItem){
        // verifiar que existan espacios en el vector
        boolean respuesta=false;
        for(int i=0;i<items.length;i++){
            //SI hay espacion añadir el item y retornar true
            //si no hay retornar false
            if (items[i]==elimItem){
                items[i]=null;
                respuesta=true;
            }
        }
        return respuesta;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", estadoPedido=" + estadoPedido + ", descuento=" + descuento + ", motivoCancelado=" + motivoCancelado + ", total=" + total + ", fecha=" + fecha + ", items=" + items[0].precio + '}';
    }
    
    
}
