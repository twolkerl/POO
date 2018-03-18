package main;

import model.Vendedor;
import static util.MathUtil.*;

/**
 * 3. Alcides Nogueira é um vendedor e o seu salário fixo é de R$1500,00.
 * Sabe-se que ele ganha 15% mensais de comissão sobre suas vendas efetuadas.
 * Em maio, ele vendeu R$9500,00. Exiba na tela o seu nome, o salário fixo e
 * salário no final do mês.
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
        
        Vendedor vendedor = new Vendedor("Alcides Nogueira", 1500, 15, 9500);
        
        double valorComissao = vendedor.getSalarioFixo()
                + calcularPorcentagemValor(vendedor.getValorVenda(),
                        vendedor.getPorcentagemComissao());
        
        vendedor.setSalarioMesAtual(valorComissao);
        
        vendedor.imprimirDados();
        
    }
    
}
