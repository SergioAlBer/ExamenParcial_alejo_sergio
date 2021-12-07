
package Banco;

import Usuario.Cuenta;
import Usuario.Tarjeta;


public class Cajero {
    
    private String nombre;
    private String direccion;
    
    
    
    public boolean depositar(Tarjeta t,Cuenta c,float monto){
        boolean result=false;
         if(monto > 0.0){
            c.depositar(monto);
            result = true;
        }
        
        return result;
        
        
        
    }
    
    public boolean retirar(Tarjeta t,Cuenta c,float monto){
        boolean result=false;
         if(monto > 0.0){
            c.retirar(monto);
            result = true;
        }
        
        return result;
        
        
        
    }
    
    
    public boolean transferir(Tarjeta t,Cuenta c,float monto){
        boolean result=false;
        
        
        return result;
        
        
        
    }
    
    public boolean validarTarjeta(String RUCBanco,String numTarjeta,String DNI,String clave){
        boolean result=false;
        
        
        return result;
    }
    
}
