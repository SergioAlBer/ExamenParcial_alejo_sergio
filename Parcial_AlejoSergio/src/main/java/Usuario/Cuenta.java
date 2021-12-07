
package Usuario;

import java.util.Date;

public class Cuenta {
    
    private String numero;
    private Date fechaApertura;
    private float saldo;
    private Cliente titular;
    private Tarjeta tarjeta;

     public Cuenta(String numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
     
     
     
    public boolean depositar(float monto){
        boolean result=false;
        if(monto > 0.0){
            this.saldo += monto;
            result = true;
        }
        
        return result;
        
    }

    
    
    public boolean retirar(float monto){
        boolean result=false;
        if(monto > 0.0){
            this.saldo -= monto;
            result = true;
        }
        
        return result;
        
    }
    
    public boolean transferir(float monto){
        boolean result=false;
        
        
        return result;
        
    }
    
    public float consultarSaldo(){
        
        if(this.saldo>0){
            
            return this.saldo;
            
        }
        
        return 0;
        
    }
    
    public boolean validarTarjeta(String clave){
        boolean result=false;
        
        
        return result;
        
    }
    
    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", fechaApertura=" + fechaApertura + ", saldo=" + saldo + ", titular=" + titular +  '}';
    }
    
    
    
}
