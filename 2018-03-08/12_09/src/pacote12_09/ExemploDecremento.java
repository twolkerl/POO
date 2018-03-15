/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote12_09;
import java.util.*;

public class ExemploDecremento {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("digite valor: ");
        int valor = ler.nextInt();

        int a = valor;

        while (a <= valor && a >= 0) {
            System.out.println(a);
            a--; // a = a-1;
        }
    }

}
