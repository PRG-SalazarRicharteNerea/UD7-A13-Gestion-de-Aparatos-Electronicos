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
       private Enchufable[] aparatosEnchufados;
       private int contador=0;
       
public Regleta(){
    this.aparatosEnchufados= new Enchufable[MAXIMO_ENCHUFADOS];
    
}

 public boolean enchufar(Enchufable aparato) {
        if (contador < MAXIMO_ENCHUFADOS && !contieneAparato(aparato)) {
            aparatosEnchufados[contador] = aparato;
            aparato.darEnergia();
            contador++;
            return true;
        }
        return false;
    }
 
  public boolean desenchufar(Enchufable aparato) {
        for (int i = 0; i < contador; i++) {
            if (aparatosEnchufados[i] == aparato) {
                aparato.quitarEnergia();
                for (int j = i; j < contador - 1; j++) {
                    aparatosEnchufados[j] = aparatosEnchufados[j + 1];
                }
                aparatosEnchufados[contador - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }
  
  public void mostrarAparatosConectados() {
        System.out.println("Aparatos conectados a la regleta:");
        for (int i = 0; i < contador; i++) {
            System.out.println("- " + ((AparatoElectrico) aparatosEnchufados[i]));
        }
        System.out.println("Número de tomas libres: " + (MAXIMO_ENCHUFADOS - contador));
    }
 
 private boolean contieneAparato(Enchufable aparato) {
        for (int i = 0; i < contador; i++) {
            if (aparatosEnchufados[i] == aparato) {
                return true;
            }
        }
        return false;
    }
}


