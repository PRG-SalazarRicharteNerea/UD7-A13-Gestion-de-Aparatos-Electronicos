package Tienda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author batoi
 */
public abstract class AparatoElectrico implements Enchufable {

    private boolean estaRecibiendoCorriente;

    private String numeroSerie;

    private boolean estaEncendido;

    public AparatoElectrico(String numeroSerie) {
        this.estaRecibiendoCorriente = false;
        this.numeroSerie = numeroSerie;
        this.estaEncendido = false;
    }

    @Override
    public void quitarEnergia() {

        this.estaRecibiendoCorriente = true;

    }

    @Override
    public void darEnergia() {
        this.estaRecibiendoCorriente = false;
    }

    public void mostrarDetalle() {
        System.out.print("Num.Serie:" + numeroSerie + (estaRecibiendoCorriente ? ", (Con corriente electtrica)" : ", (sin corriente electrica)") + (estaEncendido ? ", está encendido" : ", no está encendido"));
    }
}
