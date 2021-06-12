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
public class Ofertas extends Productos{
    int Descuento;

    public Ofertas() {
        super();
        this.Descuento = 0;
    }

    public Ofertas(int Descuento, int Codigo, int Precio, String Descripcion) {
        super(Codigo, Precio, Descripcion);
        this.Descuento = Descuento;
    }

    public int getDescuento() {
        return Descuento;
    }

    public void setDescuento(int Descuento) {
        this.Descuento = Descuento;
    }
    
    
}
