/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resueltos.guia1.ejercicio3;

/**
 *
 * @author karol
 */
public class CuentaBancaria {
    private String CBU; //CBU como string, porque 22 dígitos es imposible como dato numérico (?
    private String tipo_cuenta;
    private double saldo; //Salvo que se aclare, es 0 por default.
    
   
    public void Depositar(double monto){
        if(monto >0){
            saldo += monto;
        }
        else{
            System.out.println("El monto a depositar debe ser un real positivo");
        }
    }
    
    public void Extraer(double monto){
        if(monto >0 && tipo_cuenta == "corriente"){
            saldo -= monto;
        }
        
        else if(monto>0 && tipo_cuenta == "ahorro"){
            if(monto <=saldo){
                saldo -=monto;
            }
            else{
                System.out.println("Su saldo disponible no permite extraer ARS "+ monto);
            }
        }
    }
    
    public double getSaldoActual(){
        return saldo;
    }
    
    public void setCBU(String cbu){
        CBU = cbu;
    }
    
    public void setTipoCuenta(String tipo){
        tipo_cuenta = tipo;
    }
    
    public String getTipoCuenta(){
        return tipo_cuenta;
    }
    
    
    public void getUltimosTresCBU(){
        String ultimos = CBU.substring(19);
        System.out.println("Últimos 3 dígitos del CBU: " + ultimos);
    }
    
    //agrego un método que muestre los datos ingresados en prog ppal.
    public void MostrarDatos(){
        System.out.println("CBU: " + CBU + "\nTipo de cuenta: " + tipo_cuenta + "\nSaldo actual: "+saldo);
    }
    
}
