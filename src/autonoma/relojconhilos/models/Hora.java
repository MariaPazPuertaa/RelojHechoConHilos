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
public class Hora extends Tiempo {
    
    /**
     * Constructor que inicializa la hora con un valor dado.
     *
     * @param valorInicial Valor inicial de la hora (entre 0 y 23).
     */
    public Hora(int valorInicial) {
        super(24, valorInicial);
    }
    
}
