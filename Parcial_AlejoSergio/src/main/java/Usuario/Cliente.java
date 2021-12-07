
package Usuario;

import Operaciones.Operacion;


public class Cliente {
    
    private String DNI;
    private String nombre;
    private String direccion;
    
    
    
    public boolean depositar(Cuenta c,float monto){
        boolean result=false;
        if(monto > 0.0){
            c.depositar(monto);
            result = true;
        }
        
        return result;
        
    }
    
    public boolean retirar(Cuenta c,float monto){
        boolean result=false;
        if(monto > 0.0){
            c.retirar(monto);
            result = true;
        }
        
        return result;
        
    }
    
    public boolean transferir(Cuenta c,float monto){
        boolean result=false;
        if(monto>0.0){
            
            
        }
        
        return result;
        
    }
    
    public Operacion[] consultarMovimientos(Cuenta c){
        
    }
    
    
}
