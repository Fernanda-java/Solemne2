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
public class Aseo extends Productos{
    int cc;
    int ml;

    public Aseo() {
        super();
        this.cc = 0;
        this.ml = 0;
    }

    public Aseo(int cc, int ml, int Codigo, int Precio, String Descripcion) {
        super(Codigo, Precio, Descripcion);
        this.cc = cc;
        this.ml = ml;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }
    
    
    
}
