/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote12_09;

import java.util.*;

public class ExemploWhileB {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("digite valor: ");
        int valor = ler.nextInt();

        int cont = 1;

        while (cont <= valor) {
            System.out.println(cont);
            cont++;
        }
    }

} 
