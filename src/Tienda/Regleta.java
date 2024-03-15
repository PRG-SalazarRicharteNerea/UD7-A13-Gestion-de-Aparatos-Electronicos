/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

/**
 *
 * @author batoi
 */
public class Regleta {
    private static final int MAXIMO_ENCHUFADOS = 10;
    private AparatoElectrico[] aparatosEnchufados;
    private int contador;

    public Regleta() {
        this.aparatosEnchufados = new AparatoElectrico[MAXIMO_ENCHUFADOS];
        this.contador = 0;
    }

    public boolean enchufar(AparatoElectrico aparato) {
        if (contador < MAXIMO_ENCHUFADOS && !contieneAparato(aparato)) {
            aparatosEnchufados[contador++] = aparato;
            aparato.darEnergia();
            return true;
        }
        return false;
    }

    public boolean desenchufar(AparatoElectrico aparato) {
        for (int i = 0; i < contador; i++) {
            if (aparatosEnchufados[i].getNumeroSerie().equals(aparato.getNumeroSerie())) {
                aparatosEnchufados[i].quitarEnergia();
                aparatosEnchufados[i] = aparatosEnchufados[--contador];
                aparatosEnchufados[contador] = null;
                return true;
            }
        }
        return false;
    }

   private boolean contieneAparato(AparatoElectrico aparato) {
    for (int i = 0; i < contador; i++) {
        if (aparatosEnchufados[i].getNumeroSerie() != null && aparatosEnchufados[i].getNumeroSerie().equals(aparato.getNumeroSerie())) {
            return true;
        }
    }
    return false;
}

    public void mostrarAparatosConectados() {
        if (contador == 0) {
            System.out.println("No hay aparatos conectados a la regleta.");
        } else {
            for (int i = 0; i < contador; i++) {
                aparatosEnchufados[i].mostrarDetalle();
            }
        }
    }

    public int numeroTomasLibres() {
        return MAXIMO_ENCHUFADOS - contador;
    }
}