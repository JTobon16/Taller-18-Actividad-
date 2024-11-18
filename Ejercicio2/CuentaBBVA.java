/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller18.Ejercicio2;

/**
 *
 * @author altoc
 */
public class CuentaBBVA implements Transferencias{

    @Override
    public void transferir(double monto, String cuenta){
        System.out.println("Transfiriendo "+monto+ " a la cuenta "+cuenta);
        }
    
}
