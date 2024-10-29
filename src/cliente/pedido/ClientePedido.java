/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente.pedido;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class ClientePedido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       Scanner datos = new Scanner (System.in);
        ArrayList<Cliente>clientes =new ArrayList<>();
        
        int numero=0;
        while(numero!=2){
            
            
       System.out.println("Menu");
       System.out.println("Inserte un numero del Menu");
       System.out.println("1. Agregar cliente y pedido: ");
       System.out.println("2. Ver cliente y pedido registrados: ");
       numero = datos.nextInt();  
       datos.nextLine();
       
  
           
       
        switch (numero) {
            case 1 -> {
                System.out.println("Ingrese el numero de clientes:");
                
                int numerocl = datos.nextInt();
                datos.nextLine();
                
                for(int i=0;i<numerocl; i++){
                    
                    System.out.println("nombre del cliente:"+(i+1));
                    String nombre = datos.nextLine();
                    System.out.println("Email del cliente:"+(i+1));
                    String email = datos.nextLine();
                    System.out.println("Edad del cliente:"+(i+1));
                    int edad = datos.nextInt();
                    datos.nextLine();
                    
                    Cliente cliente = new Cliente(nombre, email, edad);
                    
                    
                    System.out.println("Ingrese el numero de pedidos que realizara el cliente: ");
                    int numeroP = datos.nextInt();
                    datos.nextLine();
                    
                    for(int l=0;l<numeroP;l++){
                        
                        System.out.println("Nombre del producto:"+(l+1));
                        String producto = datos.nextLine();
                        System.out.println("Cantidad del producto:"+(l+1));
                        int cantidad = datos.nextInt();
                        datos.nextLine();
                        
                        Pedido pedido= new Pedido(producto, cantidad);
                        cliente.AgregarPedido(pedido);
                    }
                    clientes.add(cliente);
                }
                break;
            }
            case 2 -> {
                for(Cliente cliente:clientes){
                    cliente.MostrarPedido();
                    
                }
                break;
                
            }
            default -> System.out.println("Error en la seleccion del numero del menu, intenta nuevamente ");
        }
       
       
        
        }
}
}
    

