/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad.dispositivos;

/**
 *
 * @author batoi
 */
public class Computador extends DispositivoInformático {

    private int memoriaRam;
    private double velocidadCpu;
    private double tamaño;

    public Computador(String numeroDeSerie, int memoriaRam, double velocidadCpu, double tamaño) {
        super(numeroDeSerie);
        this.memoriaRam = memoriaRam;
        this.velocidadCpu = velocidadCpu;
        this.tamaño = tamaño;

    }

      
    @Override
    public void mostrarDetalle() {
        System.out.print("[Computador] ");
        super.mostrarDetalle(); 
        System.out.print((estaConectadoAInternet? "Conectado a Internet" : "No conectado a Internet")+ ", RAM: " + memoriaRam + ", Velocidad CPU: "+ velocidadCpu+ ", Tamaño HD: " + tamaño+"\n\n");
    }
    
}
