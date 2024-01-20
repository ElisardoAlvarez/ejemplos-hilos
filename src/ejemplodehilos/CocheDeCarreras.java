/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodehilos;

/**
 *
 * @author politecnica
 */
public class CocheDeCarreras extends Coche implements Runnable{

    public CocheDeCarreras(int id) {
        super(id);
    }

    @Override
    public void run() {
        
        while(!EjemploDeHilos.empiezaCarrera)
        {
            // bucle vacío.
            
            // Espera activa. !!EVITAR!!
        }
        
        System.out.println(this);
    }
}
