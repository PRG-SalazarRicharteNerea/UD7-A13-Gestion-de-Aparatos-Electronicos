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

    private boolean estaEncendido;
    private boolean estaConectadoAInternet;

    public DispositivoInformático() {
        this.estaEncendido = false;
        this.estaConectadoAInternet = false;
    }

}
