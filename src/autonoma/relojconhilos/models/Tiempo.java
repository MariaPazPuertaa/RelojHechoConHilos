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
public class Tiempo {
    
    /**
     * Valor actual de la unidad de tiempo (por ejemplo, segundos actuales).
     */
    protected int valor;

    /**
     * Límite máximo antes de reiniciar (por ejemplo, 60 para segundos y minutos, 24 para horas).
     */
    protected int limite;

    /**
     * Constructor de la clase Tiempo.
     *
     * @param limite El valor máximo que puede alcanzar esta unidad de tiempo antes de reiniciar (no incluido).
     * @param valorInicial El valor inicial que tendrá esta unidad de tiempo.
     */
    public Tiempo(int limite, int valorInicial) {
        this.limite = limite;
        this.valor = valorInicial % limite; // Asegura que el valor inicial esté dentro del rango permitido
    }

    /**
     * Incrementa el valor de la unidad de tiempo en 1.
     * Si se alcanza el límite, se reinicia a 0 automáticamente (comportamiento cíclico).
     */
    public void incrementar() {
        valor = (valor + 1) % limite;
    }

    /**
     * Devuelve el valor actual de la unidad de tiempo.
     *
     * @return El valor actual.
     */
    public int getValor() {
        return valor;
    }

    /**
     * Reinicia el valor de la unidad de tiempo a 0.
     */
    public void reiniciar() {
        valor = 0;
    }
}
