/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad.tiendaelectrodomesticos;

/**
 *
 * @author batoi
 */
public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora(int numeroSerie, String marca, String modelo) {
        super(numeroSerie, marca, modelo);
        this.carga = 7;
    }

    @Override
    public void ElectrodomesticoEncedido() {
    }
    
     
   @Override
    public int obtenerPrecioVenta() {
        int precioFinal = super.obtenerPrecioVenta();

        if (this.carga > 10) {
            precioFinal += 50; 
        }

        return precioFinal;
    }
    
    
    
}
