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

    public void imprimirDadosFormatado(Aluno aluno) {

        if (Objects.nonNull(aluno)) {
            System.out.print(aluno.getNome() + "\t\t");

            if (aluno.getNota() == 10) {
                System.out.println("DEZ");
            } else {
                System.out.println(aluno.getNota());
            }
        }

    }

}
