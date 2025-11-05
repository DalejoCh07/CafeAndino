
package ec.edu.espoch.cafeandino.clases;

import ec.edu.espoch.cafeandino.enumeracion.EstadoPedido;
import ec.edu.espoch.cafeandino.enumeracion.Tallas;

public class ItemPedido {
    //Atributos
    public int idItem;
    public String nombreBebida;
    public Tallas talla;
    public String[] extra;
    public double precio;
    public double descuentoPromocion;
    
    //Metodos

    @Override
    public String toString() {
        return "ItemPedido{" + "idItem=" + idItem + ", nombreBebida=" + nombreBebida + ", talla=" + talla + ", extra=" + extra + ", precio=" + precio + ", descuentoPromocion=" + descuentoPromocion + '}';
    }

    
    
    public ItemPedido(int idItem, String nombreBebida, Tallas talla) {
        this.idItem = idItem;
        this.nombreBebida = nombreBebida;
        this.talla = talla;
        extra=new String[1];
    }
    
    public boolean agregarExtra(String nombre){
        boolean respuesta=false;
        for(int i=0;i<extra.length;i++){
            if (extra[i]!=null){
                this.extra[i]=nombre;
                respuesta=true;
            }
        }
        return respuesta;
    }
    
    public boolean eliminarExtra(String elimExtra){
        boolean respuesta=false;
        for(int i=0;i<extra.length;i++){
            if(extra[i]==elimExtra){
                this.extra[i]=null;
                respuesta=true;
            }
        }
        return respuesta;
    }
    
    public boolean cambiarTalla(Tallas tallaNueva, EstadoPedido estadoActual){
        boolean respuesta=false;
        if(estadoActual!=EstadoPedido.PREPARANDO){
            this.talla=tallaNueva;
            respuesta=true;
        }
        return respuesta;
    }
    
    public double aplicarPromocion(Promocion promocion, Cliente cliente){
        if (promocion.nombreBebida=="Latte" && promocion.talla==Tallas.MEDIANO){
            descuentoPromocion=promocion.descuento;
        }
        return 0;
    }

}
