
package ec.edu.espoch.cafeandino;

import ec.edu.espoch.cafeandino.clases.Pedido;
import ec.edu.espoch.cafeandino.enumeracion.EstadoPedido;
import ec.edu.espoch.cafeandino.enumeracion.Tallas;
import ec.edu.espoch.cafeandino.clases.Promocion;
import ec.edu.espoch.cafeandino.clases.Cliente;
import ec.edu.espoch.cafeandino.clases.Factura;
import ec.edu.espoch.cafeandino.clases.ItemPedido;
import ec.edu.espoch.cafeandino.enumeracion.MetodoPago;

public class CafeAndino {

    public static void main(String[] args) {
        
        //Promocion
        
        //Promocion promocionDia=new Promocion(1, "Cupon del día", "Latte", Tallas.MEDIANO, true, 0.15, "26/10/2025");
        
        //Agregar pedido 1 
        
        
        Cliente clienteUno=new Cliente(1, "Ana", "001", "La florida");
        
        
        ItemPedido item1PedidoUno=new ItemPedido(1, "Latte", Tallas.MEDIANO);
        item1PedidoUno.agregarExtra("Avena"); //Agregar extra al item
        item1PedidoUno.precio=3.5;
        
        System.out.println(item1PedidoUno.toString());
        
        
        ItemPedido item2PedidoUno=new ItemPedido(2, "Expreso", Tallas.PEQUEÑO);
        item2PedidoUno.agregarExtra("Kevin");
        item2PedidoUno.precio=2.5;
        
        
        
        System.out.println(item2PedidoUno.toString());
        
        
        Pedido pedidoUno=new Pedido(EstadoPedido.CREADO);
        
        pedidoUno.agregarItems(item1PedidoUno);
        pedidoUno.agregarItems(item2PedidoUno);
        
        double total1=pedidoUno.calcTotal();        
        System.out.println(total1);
        
        pedidoUno.calcDescuento(0.15);
        
        //Aplicar descuento (cupon del día)
        
        //Cambiar estado pedido
        pedidoUno.cambiarEstado(EstadoPedido.PREPARANDO);
        pedidoUno.cambiarEstado(EstadoPedido.LISTO);
        pedidoUno.añadirObservacion("Latte con avena, expresso pequeño");
        pedidoUno.cambiarEstado(EstadoPedido.ENTREGADO);
        
        
        
        System.out.println(pedidoUno.toString());
        
        //Agregar pedido 2
        Pedido pedidoDos=new Pedido(EstadoPedido.CREADO);
        pedidoUno.fecha="26/10/2025";
        
        ItemPedido item1PedidoDos=new ItemPedido(1, "Chocolate caliente", Tallas.GRANDE);
        item1PedidoDos.agregarExtra("Galleta de avena");
        pedidoDos.cambiarEstado(EstadoPedido.PREPARANDO);
        item1PedidoDos.cambiarTalla(Tallas.MEDIANO, EstadoPedido.PREPARANDO);
        pedidoDos.cancelar("Cliente cambió de idea");
        
        
        
        
        
        
        
        
        
    }
}
