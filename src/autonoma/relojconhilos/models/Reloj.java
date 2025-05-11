/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.relojconhilos.models;

import java.time.LocalTime;

/**
 *
 * @author Maria Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250430
 * @version 1.0.0
 */
public class Reloj extends Thread {
    /**
     * Objeto de la clase Hora.
     */
    private Hora hora;
    
    /**
     * Objeto de la clase Minuto.
     */
    private Minuto minuto;
    
    /**
     * Objeto de la clase Segundo.
     */
    private Segundo segundo;

    /**
     * Constructor de la clase Reloj.
     */
    public Reloj() {
        LocalTime ahora = LocalTime.now();
        hora = new Hora(ahora.getHour());
        minuto = new Minuto(ahora.getMinute());
        segundo = new Segundo(ahora.getSecond());
    }

    /**
     * Método sobrescrito del hilo que inicia el funcionamiento del reloj.
     * Incrementa los segundos cada segundo y actualiza los minutos y horas si es necesario.
     * Imprime la hora actual del reloj en formato HH:MM:SS por consola.
     */
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                segundo.incrementar();

                if (segundo.getValor() == 0) {
                    minuto.incrementar();
                    if (minuto.getValor() == 0) {
                        hora.incrementar();
                    }
                }

                System.out.printf("%02d:%02d:%02d\n",
                    hora.getValor(), minuto.getValor(), segundo.getValor());

            } catch (InterruptedException e) {
                System.out.println("Reloj detenido.");
                break;
            }
        }
    }
    
}
