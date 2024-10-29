/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente.pedido;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PERSONAL
 */
public class Cliente {
    private String nombre;
    private String email;
    private int edad;
    private List<Pedido>Pedidos;

    public Cliente(String nombre, String email, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.Pedidos= new ArrayList<>();
        
    }
     
    public void AgregarPedido (Pedido pedidos){
       Pedidos.add(pedidos);
    }
    
    public void MostrarPedido(){
        System.out.println("EL pedido de "+nombre+"es de: ");
        for(Pedido pedido:Pedidos){
            pedido.MostrarPedidos();
        }
    }
           

    
    
}
