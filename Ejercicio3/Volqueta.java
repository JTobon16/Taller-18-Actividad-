/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller18.Ejercicio3;

/**
 *
 * @author altoc
 */
public class Volqueta implements Conducir, CargarMercancia{

     public void conducir(){
        System.out.println("Se conduce la Volqueta");
     }

    @Override
    public void cargarMercancia() {
        System.out.println("Se esta cargando arena");
    }


}