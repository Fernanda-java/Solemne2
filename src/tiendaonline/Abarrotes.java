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
public class Abarrotes extends Productos {
    private String Categoria;
    private int Kg;

    public Abarrotes() {
        super();
        this.Categoria ="";
        this.Kg = 0;
    }

    public Abarrotes(String Categoria, int Kg, int Codigo, int Precio, String Descripcion) {
        super(Codigo, Precio, Descripcion);
        this.Categoria = Categoria;
        this.Kg = Kg;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getKg() {
        return Kg;
    }

    public void setKg(int Kg) {
        this.Kg = Kg;
    }
    
    
}
