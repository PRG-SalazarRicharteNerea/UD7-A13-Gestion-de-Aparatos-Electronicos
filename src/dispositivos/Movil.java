/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dispositivos;

/**
 *
 * @author batoi
 */
public class Movil extends DispositivoInformático {

    private String numeroDeSerie;
    private MemoriaInterna memoriaInterna;
    private String marca;
    private String modelo;

    public Movil(String numeroDeSerie, MemoriaInterna memoriaInterna, String marca, String modelo) {
        this.numeroDeSerie = numeroDeSerie;
        this.memoriaInterna = memoriaInterna;
        this.marca = marca;
        this.modelo = modelo;

    }

}
