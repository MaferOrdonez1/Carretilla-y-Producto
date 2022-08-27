/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercado;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase define la Carretilla de compras del cliente en ella pueden haber
 * muchos productos, los cuales se van agreando de diferentes formas.
 */
public class Carretilla {

    // Atributo que define una lista de productos contenidos en la carretilla
    private List<Producto> lista = new ArrayList<Producto>();

    /**
     * Constructor de la clase Carretilla
     */
    public Carretilla() {
        super();
    }

    public Carretilla(List<Producto> lista){
        super();
        this.lista = lista;
     
    }
    /**
     * Método que agrega un producto a la lista de la carretilla
     *
     * @param p Parámetro de tipo Producto a agregar a la lista
     */
    public void agregar(Producto p) {
        lista.add(p);
    }
    
    public void agregar(String producto, int precio){
        lista.add(new Producto(producto, precio));
    }
    
    public void agregar(List<Producto> Producto) {
        lista.addAll(Producto);
    }
    public void agregar(Producto... prs){
        for(Producto p:prs){
            lista.add(p);
        }
    }
}
