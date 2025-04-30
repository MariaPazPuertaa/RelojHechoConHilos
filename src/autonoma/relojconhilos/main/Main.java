/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.relojconhilos.main;

import autonoma.relojconhilos.models.RelojHiloHerencia;
import autonoma.relojconhilos.models.RelojHiloInterface;

/**
 *.
 * @author Maria Paz Puerta Acevedo
 */
public class Main {
    public static void main(String[] args) {
        // Crear objeto que implementa Runnable
        RelojHiloInterface relojInterface = new RelojHiloInterface();
        Thread hiloInterface = new Thread(relojInterface);
        
        // Crear objeto que hereda de Thread
        RelojHiloHerencia relojHerencia = new RelojHiloHerencia();
        
        // Iniciar ambos hilos
        hiloInterface.start();
        relojHerencia.start();
        
        
    }
}
