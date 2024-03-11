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

    private String numeroDeSerie;
    private int memoriaRam;
    private double velocidadCpu;
    private double tamaño;

    public Computador(String numeroDeSerie, int memoriaRam, double velocidadCpu, double tamaño) {
        this.numeroDeSerie = numeroDeSerie;
        this.memoriaRam = memoriaRam;
        this.velocidadCpu = velocidadCpu;
        this.tamaño = tamaño;

    }

}
