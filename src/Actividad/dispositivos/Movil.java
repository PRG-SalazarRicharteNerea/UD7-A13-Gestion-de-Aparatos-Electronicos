/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad.dispositivos;

/**
 *
 * @author batoi
 */
public class Movil extends DispositivoInformático {

    
    private MemoriaInterna memoriaInterna;
    private String marca;
    private String modelo;
    

    public Movil(String numeroDeSerie, MemoriaInterna memoriaInterna, String marca, String modelo) {
        super(numeroDeSerie);
        this.memoriaInterna = memoriaInterna;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void mostrarDetalle() {
        System.out.print("[Movil] ");
        super.mostrarDetalle();
        System.out.print(", Memoria: "+ memoriaInterna+", Marca: "+marca+", Modelo: "+modelo+"\n\n");
    }
    
    

}
