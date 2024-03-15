/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad.tiendaelectrodomesticos;

import Tienda.AparatoElectrico;

/**
 *
 * @author batoi
 */
public class Electrodomestico extends AparatoElectrico {
    
 
    protected int precioBase;
    private String marca;
    private String modelo;
    protected Color color;
    protected ConsumoEnergetico consumoEnergetico;
    private int peso;

    
    public Electrodomestico(String numeroSerie, String marca, String modelo) {
        super(numeroSerie);
        this.precioBase = 100;
        this.marca = marca;
        this.color = Color.BLANCO;
        this.consumoEnergetico = ConsumoEnergetico.F;
        this.peso = 5;
        this.modelo = modelo;
    }

   public int obtenerPrecioVenta() {
        int precioVenta = this.precioBase; 

 
        switch (this.consumoEnergetico) {
            case A:
                precioVenta += 100;
                break;
            case B:
                precioVenta += 80;
                break;
            case C:
                precioVenta += 60;
                break;
            case D:
                precioVenta += 50;
                break;
            case E:
                precioVenta += 30;
                break;
            case F:
                precioVenta += 10;
                break;
        }

        return precioVenta;
    }

  
    
   @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
        System.out.printf(", Marca: " + marca + ", Modelo: " + modelo);
    }
   
}
