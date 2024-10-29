/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente.pedido;

/**
 *
 * @author PERSONAL
 */
public class Pedido {
    private String producto;
    private int cantidad;

    public Pedido( String producto, int cantidad) {
        
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public void MostrarPedidos(){
        System.out.println("Producto: "+producto+", cantidad: "+cantidad);
        
    }
    
    
    }

