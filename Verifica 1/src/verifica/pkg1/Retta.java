/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verifica.pkg1;

/**
 *
 * @author studente_2
 */
public class Retta {

    public double a = 0, b = 0, c = 0;

    public Retta(double x, double y, double noto) {

        this.a = x;
        this.b = y;
        this.c = noto;
    }

    public String getTipo() {
        if ((a != 0) && (b != 0)) {
            return "La retta è obliqua.";
        } else {
            if ((a != 0) && (b == 0)) {
                return "La retta è orizzontale.";
            } else {
                if ((a == 0) && (b != 0)) {
                    return ("La retta è verticale.");
                } else {
                    return "I valori inseriti non sono validi, riprovare";
                }
            }
        }
    }

    public boolean appartiene(double x, double y) {
        if ((this.a * x) + (this.b * y) + (this.c) == 0) {
            return true;
        }
            return false;
       

    }

    public String stampa() {

        if ((a == 0) && (b == 0)) {
            return "La retta non ha equazione.";
        } else {

            return (a + "x + " + b + "y + " + c + " = 0");
        }
    }
}
