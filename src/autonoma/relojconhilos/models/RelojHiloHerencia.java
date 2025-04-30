/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.relojconhilos.models;

/**
 *.
 * @author Maria Paz Puerta Acevedo
 */
public class RelojHiloHerencia extends Thread {
    @Override
    public void run() {
        while (true) {
            // Obtener la hora actual
            long currentTimeMillis = System.currentTimeMillis();
            java.util.Date date = new java.util.Date(currentTimeMillis);

            // Imprimir la hora actual
            System.out.println(date.toString());

            try {
                // Esperar 1 segundo antes de actualizar la hora
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hilo de reloj interrumpido");
                break; // Si se interrumpe el hilo, salimos del ciclo
            }
        }
    }
}
