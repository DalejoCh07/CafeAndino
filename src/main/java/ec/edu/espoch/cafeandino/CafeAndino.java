
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
        Promocion promocionDia=new Promocion(1, "Cupon del día", "Latte", Tallas.MEDIANO, true, 0.15, "26/10/2025");
        
        //Agregar pedido 1 
        Cliente clienteUno=new Cliente("Ana", "001", "La florida");
        Pedido pedidoUno=new Pedido(1, EstadoPedido.CREADO);
        pedidoUno.fecha="26/10/2025";
        
        ItemPedido item1PedidoUno=new ItemPedido("Latte", Tallas.MEDIANO);
        item1PedidoUno.agregarExtra("Avena"); //Agregar extra al item
        item1PedidoUno.precio=3.5;
        
        item1PedidoUno.aplicarPromocion(promocionDia, clienteUno);
        
        System.out.println(item1PedidoUno.toString());

        ItemPedido item2PedidoUno=new ItemPedido("Expreso", Tallas.PEQUEÑO);
        item2PedidoUno.agregarExtra("Kevin");
        item2PedidoUno.precio=2.5;
  
        System.out.println(item2PedidoUno.toString());
        
        pedidoUno.agregarItems(item1PedidoUno);
        pedidoUno.agregarItems(item2PedidoUno);
        
        double total1=pedidoUno.calcTotal();        
        System.out.println(total1);
        
        pedidoUno.calcDescuento(0.15);
        
        
        //Cambiar estado pedido
        pedidoUno.cambiarEstado(EstadoPedido.PREPARANDO);
        pedidoUno.cambiarEstado(EstadoPedido.LISTO);
        pedidoUno.añadirObservacion("Latte con avena, expresso pequeño");
        pedidoUno.cambiarEstado(EstadoPedido.ENTREGADO);
        
        System.out.println(pedidoUno.toString());
        
        Factura facturaUno=new Factura(1, MetodoPago.EFECTIVO);
        facturaUno.generarFactura(pedidoUno, clienteUno);
        
        facturaUno.imprimirFactura();
        
        
        //Agregar pedido 2 (Andres)
        Cliente clienteDos=new Cliente("Andres", "002", "Las Americas");
        Pedido pedidoDos=new Pedido(2, EstadoPedido.CREADO);
        pedidoUno.fecha="26/10/2025";
        
        ItemPedido item1PedidoDos=new ItemPedido("Chocolate caliente", Tallas.GRANDE);
        item1PedidoDos.agregarExtra("Galleta de avena");
        
        pedidoDos.agregarItems(item1PedidoDos);
        
        pedidoDos.cambiarEstado(EstadoPedido.PREPARANDO);
        item1PedidoDos.cambiarTalla(Tallas.MEDIANO, pedidoDos.estadoPedido);
        pedidoDos.cancelar("Cliente cambió de idea");
        
        //Pedido 3 
        Cliente clienteTres=new Cliente("Pablo", "003", "Luis Guerra");
        Pedido pedidoTres=new Pedido(3, EstadoPedido.CREADO);
        pedidoUno.fecha="26/10/2025";
        
        ItemPedido item1PedidoTres=new ItemPedido("Capuchino", Tallas.PEQUEÑO);
        item1PedidoTres.precio=2.5;
        pedidoTres.agregarItems(item1PedidoTres);
        ItemPedido item2PedidoTres=new ItemPedido("Capuchino", Tallas.PEQUEÑO);
        item2PedidoTres.precio=2.5;
        pedidoTres.agregarItems(item2PedidoTres);
        pedidoTres.añadirObservacion("Sin trazas de nueces");
        
        pedidoTres.calcTotal();
        
        Factura facturaDos=new Factura(2, MetodoPago.EFECTIVO);
        facturaDos.generarFactura(pedidoTres, clienteTres);
        
        facturaDos.imprimirFactura();
        
    }
}
