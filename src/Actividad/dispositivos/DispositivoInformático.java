/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad.dispositivos;

import Tienda.AparatoElectrico;

/**
 *
 * @author batoi
 */
public class DispositivoInformático extends AparatoElectrico {

    protected boolean estaConectadoAInternet;
 

    public DispositivoInformático(String numeroSerie) {
        super(numeroSerie);
        this.estaConectadoAInternet = false;
    }
    
    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.print((estaConectadoAInternet ? ", Conectado a Internet" : ", No conectado a internet"));
    }
    

}