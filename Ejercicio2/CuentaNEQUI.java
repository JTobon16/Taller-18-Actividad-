/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller18.Ejercicio2;

/**
 *
 * @author altoc
 */
public class CuentaNEQUI implements PagoFactura {
   
   
    @Override
    public void pagoFactura (double monto, String motivo){
        System.out.println("Pagando: "+monto+ " por motivo de: "+motivo);}
    
}
