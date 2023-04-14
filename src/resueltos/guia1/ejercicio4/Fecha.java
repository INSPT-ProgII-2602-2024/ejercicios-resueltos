/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resueltos.guia1.ejercicio4;

/**
 *
 * @author karol
 * 
 * No hay validación de datos con while. En estos ejercicios, es relevante
 * desarrollar otras habilidades.
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        //valido día
        if(dia >=1 && dia <=31){
            this.dia = dia;
        }
        else{
            System.out.println("Nro. de DÍA inválido para una fecha");
        } 
    }

    public void setMes(int mes) {
        //valido mes
        if(mes >=1 && mes <=12){
            this.mes = mes;
        }
        else{
            System.out.println("Nro. de MES inválido para una fecha");
        }    
    }

    public void setAnio(int anio) {
        if (anio > 0) {
            this.anio = anio;     
        }              
    }
    
    //constructor
    public Fecha(int dia, int mes, int anio) {
        setDia(dia);
        setMes(mes);
        setAnio(anio);
        //elegí consultar a los setters, en lugar de usar los 'this' por defecto.
        //Es buena práctica, para poder hacer uso de las validaciones que traigan.
    }
    
    public boolean esNavidad (){
        return getDia()==25 && getMes()==12;
    }
    
    public void sumarMes(){
        if(getMes()<=11){
            setMes(mes+1);
        }
        else{
            setMes(1);
            setAnio(anio+1);
        }
    }
    
    //toString, para consultar/mostrar estado de objeto
    //puedo usarlo para inciso a)
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
    
        
    
}
