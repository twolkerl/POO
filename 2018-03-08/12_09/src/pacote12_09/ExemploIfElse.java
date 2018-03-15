/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote12_09;

import java.util.*;

public class ExemploIfElse {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.print("digite valor: ");
        int numero = ler.nextInt();

        if (numero == 0) {
            System.out.println("Número é zero");
        } else {
            System.out.println("Número não é zero");
        }

    }
}


