package pkg0315exercicio01;

import java.util.Scanner;

/**
 * 1.  	O sistema de avaliação de determinada disciplina, é composto por três
 * provas. A primeira prova tem peso 2,  a segunda tem peso 3 e a terceira
 * prova tem peso 5. Faça uma classe para calcular a média final de um aluno
 * desta disciplina.
 *
 * @author <a href="mailto:tiago.wolker.leite@gmail.com">Tiago Wolker Leite</a>
 */
public class Main {
        
    private static final float PESO1 = 2;
    private static final float PESO2 = 3;
    private static final float PESO3 = 5;
    private static final float PESO_TOTAL = PESO1 + PESO2 + PESO3;
    
    /**
     * Método principal.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float nota1;
        float nota2;
        float nota3;
        float mediaFinal = 0;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        nota1 = ler.nextFloat();
        System.out.println("Digite a segunda nota: ");
        nota2 = ler.nextFloat();
        System.out.println("Digite a terceira nota: ");
        nota3 = ler.nextFloat();
        
        mediaFinal = calcularMedia(nota1, nota2, nota3);
        
        System.out.println("Média final: " + mediaFinal);
        
    }

    /**
     * Método que calcula a média ponderada para as notas informadas.
     *
     * @param nota1 Valor da primeira nota.
     * @param nota2 Valor da segunda nota.
     * @param nota3 Valor da terceira nota.
     * @return Média ponderada.
     */
    private static float calcularMedia(float nota1, float nota2, float nota3) {
        return ((nota1 * PESO1) + (nota2 * PESO2) + (nota3 * PESO3))
                / PESO_TOTAL;
    }
    
}
