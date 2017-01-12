/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.triangolo;

import java.util.Scanner;

/**
 *
 * @author Sheax
 */
public class AreaTriangolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        float l1, l2, h, b;

        do {
            System.out.println("Inserire il valore del primo lato:");
            l1 = input.nextInt();
            if (l1 <= 0) {
                System.out.println("Il valore inserito e' troppo piccolo,riprovare!");
            }
        } while (l1 <= 0);
        do {
            System.out.println("Inserire il valore del secondo lato:");
            l2 = input.nextInt();
            if (l2 <= 0) {
                System.out.println("Il valore inserito e' troppo piccolo,riprovare!");
            }
        } while (l2 <= 0);
        do {
            System.out.println("Inserire il valore dell'altezza:");
            h = input.nextInt();
            if (h <= 0) {
                System.out.println("Il valore inserito e' troppo piccolo,riprovare!");
            }
        } while (h <= 0);
        do {
            System.out.println("Inserire il valore della base:");
            b = input.nextInt();
            if (b <= 0) {
                System.out.println("Il valore inserito e' troppo piccolo,riprovare!");
            }
        } while (b <= 0);

        float area = (b * h) / 2;
        float perimetro = l1 + l2 + b;
        System.out.println("L'area del triangolo vale " + area);
        System.out.println("Il perimetro del triangolo vale " + perimetro);
    }

}
