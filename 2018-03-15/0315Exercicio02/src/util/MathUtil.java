package util;

/**
 * Classe de utilitários para operações matemáticas.
 *
 * @author <a href="mailto:tiago.wolker.leite@gmail.com">Tiago Wolker Leite</a>
 */
public class MathUtil {

    private static final double PORCENTAGEM = 0.01;
    
    /**
     * Método para calcular o desconto aplicado na compra.
     *
     * @param valor Valor total da compra.
     * @param porcentagemDesconto Porcentagem de desconto. Ex.: 10 (10%)
     * @return Valor total a pagar com o desconto aplicado.
     */
    public static double calcularDesconto(double valor,
            double porcentagemDesconto) {
        
        return valor - (valor * porcentagemDesconto * PORCENTAGEM);
    }
    
}
