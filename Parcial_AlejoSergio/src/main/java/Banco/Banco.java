
package Banco;

import Principal.Configuracion;
import Usuario.Cliente;
import Usuario.Cuenta;
import Usuario.Tarjeta;


public class Banco {
    
    private String RUC;
    private String nombre;
    private String direccion;
    private Cuenta cuentas[];
    private Cliente clientes[];
    private int indice;

    public Banco(String RUC, String nombre, String direccion) {
        this.RUC = RUC;
        this.nombre = nombre;
        this.direccion = direccion;
        this.indice=0;
        this.cuentas=new Cuenta[Configuracion.maxCuentasxBanco];
        this.clientes=new Cliente[Configuracion.maxCuentasxBanco];
        
    }
    
    
    public boolean registrarCliente(Cliente c){
        boolean result=false;
        if(!estaLleno()){
            this.clientes[this.indice]=c;
            
            result=true;
        }
        
        return result;
        
    }
    
    public Cuenta[] getCuentasPorCliente(Cliente c){
        for(int i=0;i<this.clientes.length;i++){
            this.clientes[i]=c;
            
            
        }
        
        
    }
    
    public boolean validarTarjeta(String numTarjeta, String dni,String clave){
        boolean result=false;
         
        
        
        return result;
        
    }

    private boolean estaLleno() {
          if(this.indice==Configuracion.maxCuentasxBanco){
             return true;
         }        
         else{
             return false;
         }
    }
}
