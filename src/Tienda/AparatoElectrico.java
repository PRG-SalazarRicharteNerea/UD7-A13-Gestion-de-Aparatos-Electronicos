package Tienda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author batoi
 */
public class AparatoElectrico implements Enchufable {
    private boolean estaRecibiendoCorriente;
    private String numeroSerie;
  private boolean estaEncedido;

  
   public void AparatoElectricoEncedido() {
        this.estaEncedido = false;
    }
   
    public AparatoElectrico() {
    this.estaRecibiendoCorriente = false;
}

    public AparatoElectrico(String numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.estaRecibiendoCorriente = false;
    }

    @Override
    public void darEnergia() {
        this.estaRecibiendoCorriente = true;
    }

    @Override
    public void quitarEnergia() {
        this.estaRecibiendoCorriente = false;
    }

    public boolean estaRecibiendoCorriente() {
        return estaRecibiendoCorriente;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void mostrarDetalle() {
        System.out.print("Num.Serie: " + numeroSerie + (estaRecibiendoCorriente ? ", (Con corriente eléctrica)" : ", (Sin corriente eléctrica)") + (estaEncedido? ", Esta encendido" : ", No está encendido"));
    }
}