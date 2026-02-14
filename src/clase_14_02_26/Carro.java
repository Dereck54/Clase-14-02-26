package clase_14_02_26;

import java.math.BigDecimal;

/**
 *
 * @author Luis Villatoro
 */
public class Carro {
    // Los atributos de clases protected 
    // son visibles entre los objetos del mismo paquete
    protected Integer codigo;
    protected String marca;
    protected String modelo;
    protected BigDecimal precio;

    public Carro(Integer codigo, String marca, String modelo, BigDecimal precio) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Carro() {
    }
    
}
