
package Banco;

import Principal.Configuracion;
import Usuario.Cliente;
import Usuario.Cuenta;


public class Banco {
    
    private String RUC;
    private String nombre;
    private String direccion;
    private Cuenta cuentas[];
    private int indice;

    public Banco(String RUC, String nombre, String direccion) {
        this.RUC = RUC;
        this.nombre = nombre;
        this.direccion = direccion;
        this.indice=0;
        this.cuentas=new Cuenta[Configuracion.maxClientesxBanco];
        
    }
    
    
    public boolean registrarCliente(Cliente c){
        boolean result=false;
        if(!estaLleno()){
            this.cuentas[this.indice]=c;
            
            result=true;
        }
        
        return result;
        
    }
    
    public Cuenta[] getCuentasPorCliente(Cliente c){
        
        
        
    }
    
    public boolean validarTarjeta(String numTarjeta, String dni,String clave){
        boolean result=false;
        
        
        return result;
        
    }
}
