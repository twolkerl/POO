/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0315exercicio02;

import java.util.Scanner;

/**
 * 2.  	Uma loja oferece para os seus clientes, um determinado desconto de
 * acordo com o valor da compra efetuada. O desconto é de 10%, se o valor da
 * compra for até R$200.00, 15% se for maior que R$ 200 e menor ou igual a
 * R$ 500,00 e 20% se for acima de R$ 500,00. Crie um programa que leia o nome
 * do cliente e o valor da compra. Mostre ao final o nome do cliente, o valor
 * da compra, o percentual  de desconto e o seu valor e valor total a pagar
 * deste cliente.
 *
 * @author <a href="mailto:tiago.wolker.leite@gmail.com">Tiago Wolker Leite</a>
 */
public class Main {

    /**
     * Método principal.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nome;
        double valorCompra;
        int percentualDesconto;
        double valorTotal;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        
        System.out.println("Digite o valor da compra: ");
        valorCompra = sc.nextDouble();
        
        if (valorCompra <= 200) {
            
            valorTotal = valorCompra - valorCompra * 0.10;
            percentualDesconto = 10;
            
        } else if (valorCompra <= 500) {
            
            valorTotal = valorCompra - valorCompra * 0.15;
            percentualDesconto = 15;
            
        } else {
            
            valorTotal = valorCompra - valorCompra * 0.20;
            percentualDesconto = 20;
        }
        
        System.out.println("Cliente: " + nome);
        System.out.println("Valor da compra: " + valorCompra);
        System.out.println("Percentual desconto: " + percentualDesconto);
        System.out.println("Valor total a pagar: " + valorTotal);
        
    }
    
}
