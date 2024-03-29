/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad.tiendaelectrodomesticos;

/**
 *
 * @author batoi
 */
public class Television extends Electrodomestico{
    
    private boolean estaWifiHabilitado;
    private boolean estaConectadoAInternet;
    private int resolucion;
    int precioFinal = 0;

    public Television(int resolucion, String numeroSerie, String marca, String modelo) {
        super(numeroSerie, marca, modelo);
        this.estaWifiHabilitado = false;
        this.estaConectadoAInternet = false;
        this.resolucion = 20;
    }

    @Override
    public int obtenerPrecioVenta() {
        precioFinal = super.obtenerPrecioVenta();

        if (this.resolucion > 40) {
            precioFinal += (precioFinal * 30) / 100;
        }

        return precioFinal;
    }

    @Override
    public void mostrarDetalle() {
        System.out.print("[Television] ");
        super.mostrarDetalle();
        System.out.print(", Tipo consumo: " + consumoEnergetico + ", Color" + color + ", Precio Base: " + precioBase + ", Precio Final: " + precioFinal+ (estaWifiHabilitado? ", Wifi habilitado" : ", Wifi deshabilitado")+ (estaConectadoAInternet? ", Conectado a Internet" : ", No conectado a Internet")+", Resolucion: "+resolucion+"\n\n");
    }

}