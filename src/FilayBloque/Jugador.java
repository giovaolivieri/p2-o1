
package FilayBloque;

/**
 *
 * @author Giovanni
 */
public class Jugador {
    private String alias;
    private String nombre;
    private int edad;
    private int partGanadas;
       
    
    
         
public void setJugador(String nombre,String alias,int edad){
    this.nombre = nombre;
    this.alias = alias;
    this.edad = edad;
    this.partGanadas = 0;   
    
}
@Override
    public String toString() {
        return String.format("Nombre: "+ this.nombre + " Alias: " + this.alias + " Edad: " + this.edad + " Partidas ganadas: " + this.partGanadas);
               
        
    }
    
}
