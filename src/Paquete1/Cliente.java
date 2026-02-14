package Paquete1;

/**
 *
 * @author Luis Villatoro
 */
public class Cliente {
    
    public Integer codigo;
    public String nombre;
    public Integer edad;
    public String dni;  

    public Cliente(Integer codigo, String nombre, Integer edad, String dni) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public Cliente() {
    }
    
}
