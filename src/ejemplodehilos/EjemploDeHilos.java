/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodehilos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author politecnica
 */
public class EjemploDeHilos {

    public static boolean empiezaCarrera = false;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hilo h1 = new Hilo(1);
        Hilo h2 = new Hilo(2);
        Hilo h3 = new Hilo(3);
        
        h1.start();
        h2.start();
        h3.start();
        
        try {
            h1.join();
            h2.join();
            h3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(EjemploDeHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        System.out.println("Terminado");
        
        
        ArrayList<Thread> parrila = new ArrayList();
        for(int i = 0; i<10; i++){
            parrila.add(new Thread(new CocheDeCarreras(i)));
        }
        
        for(int i = 0; i<10; i++){
            parrila.get(i).start();
        }
       
        // Espero un poco antes de iniciar la carrera
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(EjemploDeHilos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        empiezaCarrera = true;
        
    }
}
