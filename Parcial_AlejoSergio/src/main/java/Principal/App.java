
package Principal;

import Usuario.Cliente;
import Banco.Banco;
  


public class App {
    
    public static void main(String [] args){
        
        Cliente cliente;
        Banco banco;
        
        banco=new Banco("13344","BBVA","Las Flores");
        cliente= new Cliente("9878977","Juan","Las Palmas");
        banco.registrarCliente(cliente);
        banco.toString();
    }
    
}
