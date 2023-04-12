/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resueltos.guia1.ejercicio3;

/**
 *
 * @author karol
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria();
        
        //ingreso el CBU:
        cuenta1.setCBU("0087645390000487529643");
        cuenta1.setTipoCuenta("corriente");
        cuenta1.MostrarDatos();
        
        cuenta2.setCBU("2647895462146325");
        cuenta2.setTipoCuenta("ahorro");
        
        
        cuenta1.Depositar(3570);
        
        cuenta1.MostrarDatos();
        
        cuenta1.Extraer(370);
        
        System.out.println("Saldo actual: ARS " + cuenta1.getSaldoActual());
        
        cuenta1.Extraer(5000);
        
        System.out.println("Saldo actual: ARS " + cuenta1.getSaldoActual());
        cuenta1.Depositar(860);
        System.out.println("Saldo actual: ARS " + cuenta1.getSaldoActual());
        cuenta1.getUltimosTresCBU();
        System.out.println("Tipo de cuenta: " + cuenta1.getTipoCuenta());
        
        cuenta2.MostrarDatos();
        cuenta2.Depositar(1650);
        cuenta2.MostrarDatos();
        
        cuenta2.Extraer(1800);
        cuenta2.MostrarDatos();
    }
    
}
