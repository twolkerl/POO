package main;

import java.util.Scanner;
import static util.MathUtil.*;

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

    private static final int DEZ = 10;
    private static final int QUINZE = 15;
    private static final int VINTE = 20;
    private static final int DUZENTOS = 200;
    private static final int QUINHENTOS = 500;
    
    /**
     * Método principal.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nome;
        double valorCompra;
        double percentualDesconto;
        double valorTotal;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome: ");
        nome = sc.nextLine();
        
        System.out.println("Digite o valor da compra: ");
        valorCompra = sc.nextDouble();
        
        percentualDesconto = definirPercentualDesconto(valorCompra);
        valorTotal = calcularDesconto(valorCompra, percentualDesconto);
        
        imprimirNota(nome, valorCompra, percentualDesconto, valorTotal);
        
    }

    private static void imprimirNota(String nome, double valorCompra,
            double percentualDesconto, double valorTotal) {

        System.out.println("Cliente: " + nome);
        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Percentual desconto: " + percentualDesconto + "%");
        System.out.println("Valor total a pagar: R$ " + valorTotal);
    }

    private static double definirPercentualDesconto(double valorCompra) {
        
        double percentualDesconto;
        
        if (valorCompra <= DUZENTOS) {
            
            percentualDesconto = DEZ;
            
        } else if (valorCompra <= QUINHENTOS) {
            
            percentualDesconto = QUINZE;
            
        } else {
            
            percentualDesconto = VINTE;
        }
        
        return percentualDesconto;
    }
    
}
