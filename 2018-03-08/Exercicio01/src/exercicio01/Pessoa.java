package exercicio01;

/**
 * Classe com os dados da pessoa.
 *
 * @author <a href="mailto:tiago.wolker.leite@gmail.com">Tiago Wolker Leite</a>
 */
public class Pessoa {
    
    private String nome;
    private String endereco;
    private int cep;
    private String telefone;

    public Pessoa() {
        // Contrutor para inicialização por reflexão.
    }

    public Pessoa(String nome, String endereco, int cep, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{"
                + "nome=" + nome
                + ", endereco=" + endereco
                + ", cep=" + cep
                + ", telefone=" + telefone
                + '}';
    }
    
}
