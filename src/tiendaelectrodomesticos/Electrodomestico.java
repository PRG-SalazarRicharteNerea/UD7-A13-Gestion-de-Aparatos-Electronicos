/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaelectrodomesticos;

/**
 *
 * @author batoi
 */
public class Electrodomestico {
    
    private int numeroSerie;
    private int precioBase;
    private String marca;
    private String modelo;
    private Color color;
    private ConsumoEnergetico consumoEnergetico;
    private int peso;
    private boolean estaEncedido;
    // Constructor
    public Electrodomestico(int numeroSerie, String marca, String modelo) {
        this.numeroSerie = numeroSerie;
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

    public void ElectrodomesticoEncedido() {
        this.estaEncedido = false;
    }
   
   
}

