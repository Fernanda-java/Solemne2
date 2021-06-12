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
public class Liquidos extends Productos{
    int Litros;
    int GradosAlcoholicos;

    public Liquidos() {
        super();
        this.Litros = 0;
        this.GradosAlcoholicos = 0;
    }

    public Liquidos(int Litros, int GradosAlcoholicos, int Codigo, int Precio, String Descripcion) {
        super(Codigo, Precio, Descripcion);
        this.Litros = Litros;
        this.GradosAlcoholicos = GradosAlcoholicos;
    }

    public int getLitros() {
        return Litros;
    }

    public void setLitros(int Litros) {
        this.Litros = Litros;
    }

    public int getGradosAlcoholicos() {
        return GradosAlcoholicos;
    }

    public void setGradosAlcoholicos(int GradosAlcoholicos) {
        this.GradosAlcoholicos = GradosAlcoholicos;
    }
    
    
}
