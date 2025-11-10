
package ec.edu.espoch.cafeandino.clases;

import ec.edu.espoch.cafeandino.enumeracion.EstadoPedido;


public class Pedido {
    //Atributos
    public int idPedido=0;
    public EstadoPedido estadoPedido;
    public double descuento;
    public String motivoCancelado;
    public String observacionPedido;
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
        observacionPedido=observacion;
        return false;
    }
    
    public boolean cambiarEstado(EstadoPedido nuevoEstado){
        if (this.estadoPedido == EstadoPedido.CREADO && nuevoEstado == EstadoPedido.PREPARANDO) {
            this.estadoPedido = nuevoEstado;
            return true;
        } else if (this.estadoPedido == EstadoPedido.PREPARANDO && nuevoEstado == EstadoPedido.LISTO) {
            this.estadoPedido = nuevoEstado;
            return true;
        } else if (this.estadoPedido == EstadoPedido.LISTO && nuevoEstado == EstadoPedido.ENTREGADO) {
            this.estadoPedido = nuevoEstado;
            return true;
        }
        System.out.println("Transición no permitida.");
        return false;
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
        total=calcTotal();
        descuento=total*porcentaje;
        return this.total=total-descuento;
    }
    
    public double calcTotal(){
        double total=0;
        for(int i=0;i<items.length;i++){
            total=total+this.items[i].precio;
        }
        return this.total=total;
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
}
