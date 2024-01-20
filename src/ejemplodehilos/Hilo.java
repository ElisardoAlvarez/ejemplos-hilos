/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodehilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author politecnica
 */
public class Hilo extends Thread{
    private int id;
    
    public Hilo(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(20);
        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Hola, soy " + id);
    }
}
