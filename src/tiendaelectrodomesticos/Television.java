/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaelectrodomesticos;

/**
 *
 * @author batoi
 */
public class Television extends Electrodomestico{
    private boolean estaWifiHabilitado;
    private boolean estaConectadoAInternet;
    private int resolucion;

    public Television(boolean estaWifiHabilitado, boolean estaConectadoAInternet, int resolucion, int numeroSerie, String marca, String modelo) {
        super(numeroSerie, marca, modelo);
        this.estaWifiHabilitado = false;
        this.estaConectadoAInternet = false;
        this.resolucion = 20;
    }

  @Override
    public void ElectrodomesticoEncedido() {
    }
    
      @Override
    public int obtenerPrecioVenta() {
        int precioFinal = super.obtenerPrecioVenta();

        if (this.resolucion > 40) {
            precioFinal += (precioFinal * 30) / 100; 
        }

        if (estaWifiHabilitado) {
            precioFinal += 50;
        }

        return precioFinal;
    }
    
    
    
}
