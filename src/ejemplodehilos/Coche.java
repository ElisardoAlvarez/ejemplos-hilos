/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodehilos;

/**
 *
 * @author politecnica
 */
public class Coche {

    private int id;
    
    public Coche(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Soy el coche " + id;
    }
    
}
