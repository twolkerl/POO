package exercicio02;

import java.util.Objects;

/**
 * Classe com os dados de aluno.
 *
 * @author <a href="mailto:tiago.wolker.leite@gmail.com">Tiago Wolker Leite</a>
 */
public class Aluno {

    private String nome;
    private double nota;

    public Aluno() {
    }

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String aluno) {
        this.nome = aluno;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" + "aluno=" + nome + ", nota=" + nota + '}';
    }

    /**
     * Método que imprime formatado os dados do aluno em tela.
     *
     * @param aluno {@link Aluno} com os dados para serem impressos.
     */
    public void imprimirDadosFormatado(Aluno aluno) {

        if (Objects.nonNull(aluno)) { // Verifica se o objeto não está nulo.
            
            // Imprime o nome
            System.out.print(aluno.getNome() + "\t\t");

            if (aluno.getNota() == 10) { // Verifica se a nota é igual a dez.
                // Caso seja, imprime a seguinte String.
                System.out.println("DEZ");
            } else {
                // Caso não seja, será impresso o valor da variável nota.
                System.out.println(aluno.getNota());
            }
        }
    }
}
