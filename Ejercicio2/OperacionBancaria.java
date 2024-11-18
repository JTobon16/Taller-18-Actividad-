/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Taller18.Ejercicio2;

/**
 *
 * @author altoc
 */
public interface OperacionBancaria {
    
    void transferencia(double monto, String cuenta);
    void retiros(double monto);
    void pagoFactura(double monto, String motivo);
    
    
}
