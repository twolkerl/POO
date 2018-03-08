package exercicio02;

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
    
    public String imprimirDadosFormatado(Aluno aluno) {
        String mensagem;
        
        mensagem = aluno.getNome();
        mensagem.concat("   ");
        
        if (aluno.getNota() == 10) {
            mensagem.concat("DEZ");
        } else {
            mensagem.concat(String.valueOf(aluno.getNota()));
        }
        
        return mensagem;
        
    }
    
}
