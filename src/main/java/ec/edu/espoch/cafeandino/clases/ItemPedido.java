
package ec.edu.espoch.cafeandino.clases;

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

    public ItemPedido(int idItem, String nombreBebida, Tallas talla) {
        this.idItem = idItem;
        this.nombreBebida = nombreBebida;
        this.talla = talla;
        extra=new String[3];
    }
    
    public boolean agregarExtra(String nombre){
        boolean respuesta=false;
        for(int i=0;i<extra.length;i++){
            if (extra[i]!=null){
                extra[i]=nombre;
                respuesta=true;
            }
        }
        return respuesta;
    }
    
    public boolean eliminarExtra(String elimExtra){
        boolean respuesta=false;
        for(int i=0;i<extra.length;i++){
            if(extra[i]==elimExtra){
                extra[i]=null;
                respuesta=true;
            }
        }
            
        return respuesta;
    }
    
    public boolean cambiarTalla(Tallas talla){
        return true;
    }
    
    public double aplicarPromocion(Promocion promocion, Cliente cliente){
        return 0;
    }

}
