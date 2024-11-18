/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller18.Ejercicio2;

/**
 *
 * @author altoc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        // aqui cree las 3 instancias
        Transferencias cuentaBBVA = new CuentaBBVA();
        Retiros cuentaAVVILLAS = new CuentaAVVILLAS();
        PagoFactura cuentaNEQUI = new CuentaNEQUI();
        
        // los metodos de las interfaces
        cuentaBBVA.transferir(1200000,"154321579");
        cuentaAVVILLAS.retirar(400000);
        cuentaNEQUI.pagoFactura(150000,"Factura Luz");
        
                
        
    }
    
}
