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
public class TestAparatoElectrico {

   
        public static void main(String[] args) {
    AparatoElectrico[] arrayAparatos = new AparatoElectrico[9];

    arrayAparatos[0] = new Lavadora("1234A", "V1", "Bosh");
    arrayAparatos[1] = new Lavadora("1234B", "F22", "Fagor");
    arrayAparatos[2] = new Television(45, "1234C", "superGuay", "LG");
    arrayAparatos[3] = new Television(14, "1234D", "masChula", "Sony");
    arrayAparatos[4] = new Computador("1234E", 2048, 5000.0, 1024);
    arrayAparatos[5] = new Computador("1234F", 1024, 10000.0, 2048);
    arrayAparatos[6] = new Movil("1234G", MemoriaInterna.M256, "Samsung", "GalaxY S21");
    arrayAparatos[7] = new Movil("1234H", MemoriaInterna.M512, "Iphone", "21");  
    
    System.out.println("----------------Lista de aparatos eléctricos----------------");
    verListado(arrayAparatos);
}

    public static void verListado(AparatoElectrico[] arrayAparatos){
    for (AparatoElectrico aparato : arrayAparatos) {
        if (aparato != null) {
            aparato.mostrarDetalle();
        } else {
            System.out.println("Aparato no inicializado.");
        }
    }
}
    

}