/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendaonline;

/**
 *
 * @author ferna
 */
public class Congelados extends Productos{
    int cantidad;
    int g;

    public Congelados() {
        super();
        this.cantidad = 0;
        this.g = 0;
    }

    public Congelados(int cantidad, int g, int Codigo, int Precio, String Descripcion) {
        super(Codigo, Precio, Descripcion);
        this.cantidad = cantidad;
        this.g = g;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }
    
}
