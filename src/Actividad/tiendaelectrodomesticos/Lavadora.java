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
     int precioFinal=0;

    public Lavadora(String numeroSerie, String marca, String modelo) {
        super(numeroSerie, marca, modelo);
        this.carga = 7;
    }

    
     
   @Override
    public int obtenerPrecioVenta() {
        precioFinal = super.obtenerPrecioVenta();

        if (this.carga > 10) {
            precioFinal += 50; 
        }

        return precioFinal;
    }

    @Override
    public void mostrarDetalle() {
        System.out.print("[Lavadora] ");
        super.mostrarDetalle(); 
        System.out.print(", Tipo consumo: "+ consumoEnergetico +", Color"+color+", Precio Base: "+precioBase+", Precio Final: "+precioFinal+", Carga: "+carga+"\n\n");
    }
    
    
    
    
}
