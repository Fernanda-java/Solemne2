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
public class Productos {
    private int Codigo;
    private int Precio; 
    private String Descripcion;

    public Productos() {
        this.Codigo = 1111;
        this.Precio = 0;
        this.Descripcion ="";
    }
    
    public Productos(int Codigo, int Precio, String Descripcion) {
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.Descripcion = Descripcion;

    }
    
    public Productos(Productos p) {
        this.Codigo = p.Codigo;
        this.Precio = p.Precio;
        this.Descripcion = p.Descripcion;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }


    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    
    
    
}
