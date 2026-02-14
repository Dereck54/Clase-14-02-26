package clase_14_02_26;

import Paquete1.Cliente;
import Paquete1.Producto;
import java.math.BigDecimal;
/**
 *
 * @author Luis Villatoro
 */
public class Clase_14_02_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente();
        cliente.codigo=2;
        cliente.dni="54515-5454";
        cliente.edad=20;
        cliente.nombre="Pedro";
        
        System.out.println("Código = "+cliente.codigo);
        System.out.println("Nombre = "+cliente.nombre);
        System.out.println("Edad = "+cliente.edad);
        System.out.println("Dpi = "+cliente.dni);
        
        Carro carro = new Carro();
        carro.codigo=2;
        carro.marca="Toyota";
        carro.modelo="2026";
        carro.precio=new BigDecimal(200000);
        System.out.println("Carro");
        System.out.println("Código = "+carro.codigo);
        System.out.println("Marca = "+carro.marca);
        System.out.println("Modelo = "+carro.modelo);
        System.out.println("Precio = "+carro.precio);
        
        Moto moto = new Moto();
        moto.codigo=1;
        moto.marca="Kawasaki";
        moto.modelo="2025";
        System.out.println("Moto");
        System.out.println("Código = "+moto.codigo);
        System.out.println("Marca = "+moto.marca);
        System.out.println("Modelo = "+moto.modelo);
        
        Producto producto = new Producto();
        producto.setCodigo(1);
        producto.setNombre("Monitor");
        producto.setPrecio(new BigDecimal(4000));
        
        System.out.println("++++++++Producto+++++++++");
        System.out.println("Código = "+producto.getCodigo());
        System.out.println("Nombre = "+producto.getNombre());
        System.out.println("Precio = "+producto.getPrecio());
        
        
    }
    
}
