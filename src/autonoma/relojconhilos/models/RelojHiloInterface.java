/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.relojconhilos.models;
/**
 *.
 * @author Maria Paz Puerta Acevedo
 */
public class RelojHiloInterface implements Runnable{

    @Override
    public void run() {
        while (true) {
            try {
                // Obtener la hora actual
                long currentTimeMillis = System.currentTimeMillis();
                java.util.Date date = new java.util.Date(currentTimeMillis);
                System.out.println(date.toString());
                
                // Esperar un segundo antes de actualizar la hora
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Hilo de reloj interrumpido.");
            }
        }
    }
    
}
