/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.relojconhilos.models;

/**
 *
 * @author Maria Paz Puerta Acevedo <mariap.puertaa@autonoma.edu.co>
 * @since 20250430
 * @version 1.0.0
 */
public class Minuto extends Tiempo {
    
    /**
     * Constructor que inicializa los minutos con un valor dado.
     *
     * @param valorInicial Valor inicial de los minutos (entre 0 y 59).
     */
    public Minuto(int valorInicial) {
        super(60, valorInicial); // Límite de 60 minutos por hora
    }
    
}
