/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

import Actividad.dispositivos.Computador;
import Actividad.dispositivos.MemoriaInterna;
import Actividad.dispositivos.Movil;
import Actividad.tiendaelectrodomesticos.Lavadora;
import Actividad.tiendaelectrodomesticos.Television;

/**
 *
 * @author batoi
 */
public class TestRegleta {
    
    public static void main(String[] args) {
        Regleta regleta = new Regleta();

        System.out.println("----------Crear regleta y conectar los cuatro aparatos----------");
        AparatoElectrico[] arrayAparatos = new AparatoElectrico[4];
        arrayAparatos[0] = new Lavadora("1234A", "V1", "Bosch");
        arrayAparatos[1] = new Television(45, "1234C", "superGuay", "LG");
        arrayAparatos[2] = new Computador("1234E", 2048, 5000.0, 1024);
        arrayAparatos[3] = new Movil("1234G", MemoriaInterna.M256, "Samsung", "Galaxy S21");

        for (AparatoElectrico aparato : arrayAparatos) {
            if (regleta.enchufar(aparato)) {
                System.out.println("[" + aparato.getClass().getSimpleName() + "] Aparato enchufado");
            }
        }

        System.out.println("\n----------Listar aparatos enchufados----------");
        regleta.mostrarAparatosConectados();
        System.out.println("Número de tomas libres: " + regleta.numeroTomasLibres());

        System.out.println("\n----------Desconectar lavadora y televisión----------");
        regleta.desenchufar(arrayAparatos[0]);
        System.out.println("[" + arrayAparatos[0].getClass().getSimpleName() + "] Aparato desenchufado");
        regleta.desenchufar(arrayAparatos[1]);
         System.out.println("[" + arrayAparatos[1].getClass().getSimpleName() + "] Aparato desenchufado");
        
        System.out.println("\n----------Listar aparatos enchufados----------");
        regleta.mostrarAparatosConectados();

        System.out.println("\n----------Crear móvil con número de serie 1234G ----------");
        Movil nuevoMovil = new Movil("1234G", MemoriaInterna.M512, "Motorola", "S500");
        nuevoMovil.mostrarDetalle();
        
        System.out.println("\n----------Enchufar móvil anterior y obtener mensaje de error ----------");
        if (!regleta.enchufar(nuevoMovil)) {
            System.out.println("[" + nuevoMovil.getClass().getSimpleName() + "] El aparato ya está enchufado a la regleta");
        }

        System.out.println("\n---------Desconectar aparato no enchufado (la lavadora)----------");
        if (!regleta.desenchufar(arrayAparatos[0])) {
            System.out.println("[" + arrayAparatos[0].getClass().getSimpleName() + "] El aparato no está enchufado a la regleta");
        }
    }
}

