/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mercado;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mafer
 */
public class Mercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1 = new Producto("Caja de leche", 12);
        Carretilla carreta1 = new Carretilla();
        carreta1.agregar(producto1);
        carreta1.agregar("Caja de leche", 15);
        carreta1.agregar("Libra de café", 50);
        
        
        List<Producto> carretilla2 = new ArrayList<Producto>();
        carretilla2.add(new Producto("Pan de banano", 70));
        carretilla2.add(new Producto("Galletas de chocolate", 10));
        carretilla2.add(new Producto("Galletas de chocolate", 15));
        carretilla2.add(new Producto("Galletas de vainilla", 7));
        
        carreta1.agregar(carretilla2);
    }
}
