package clase_14_02_26;


/**
 *
 * @author Luis Villatoro
 */
public class Moto {
//   La variables de la clase son default 
//   Solomente son accesibles en el mismo paquete 
    
//  La diferencia con las protected es que la 
//  protected si se puede ver fuera del paquete 
//  siempre y cuando sea con una subclase
    
    
    Integer codigo;
    String marca;
    String modelo;

    public Moto(Integer codigo, String marca, String modelo) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Moto() {
    }

}
