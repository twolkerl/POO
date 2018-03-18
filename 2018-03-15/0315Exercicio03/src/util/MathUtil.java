package util;

/**
 * Classe de utilitários para operações matemáticas.
 *
 * @author <a href="mailto:tiago.wolker.leite@gmail.com">Tiago Wolker Leite</a>
 */
public class MathUtil {

    private static final double PORCENTAGEM = 0.01;
    
    /**
     * Método para calcular o desconto aplicado no valor.
     *
     * @param valor Valor total a ser aplicado o desconto.
     * @param porcentagemDesconto Porcentagem de desconto. Ex.: 10 (10%)
     * @return Valor final com o desconto aplicado.
     */
    public static double calcularDesconto(double valor,
            double porcentagemDesconto) {
        
        return valor - (valor * porcentagemDesconto * PORCENTAGEM);
    }
    
    /**
     * Método para calcular o desconto aplicado na compra.
     *
     * @param valor Valor total a ser aplicado o juros.
     * @param porcentagemJuros Porcentagem do juros. Ex.: 10 (10%)
     * @return Valor final com o juros aplicado.
     */
    public static double calcularJuros(double valor,
            double porcentagemJuros) {
        
        return valor + (valor * porcentagemJuros * PORCENTAGEM);
    }
    
    /**
     * Método para calcular a porcentagem de dado valor.
     *
     * @param valor Valor a ser calculada a porcentagem.
     * @param porcentagem Porcentagem desejado do valor informado.
     * @return Valor calculado conforme porcentagem.
     */
    public static double calcularPorcentagemValor(double valor,
            double porcentagem) {
        
        return valor * porcentagem * PORCENTAGEM;
    }
    
}
