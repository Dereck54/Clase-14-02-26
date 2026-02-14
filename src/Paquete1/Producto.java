package Paquete1;

import java.math.BigDecimal;

/**
 *
 * @author Luis Villatoro
 */
public class Producto {
    private Integer codigo;
    private String nombre;
    private BigDecimal precio;

    public Producto(Integer codigo, String nombre, BigDecimal precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto() {
    }

    /**
     * @return the codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(Integer codigo) {
        if(codigo>5){
            System.out.println("El codigo del producto ese mayor a cinco");
        } else {
            System.out.println("El codigo del producto ese menor o igual a cinco");
        }
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public BigDecimal getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
    
}
